<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<body>

	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
			<c:forEach var="category" items="${categoryList}">
				<li>
					<a href="products.html">
						<i class="icon-circle-blank"></i>
						<span>${category.name}</span>
					</a>
				</li>
			</c:forEach>						
					<li style="border: 0">&nbsp;</li>
					<li><a class="totalInCart" href="cart.html"><strong>Total
								Amount <span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br>
					<br>
					<a class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img src="assets/img/paypal.jpg"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
			<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-ecommerce-templates.png"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/shopping-cart-template.png"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-template.png"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
					<div class="carousel-inner">

						<c:forEach var="slide" items="${slideList}" varStatus="loopVariable" >
						
							<c:if test="${loopVariable.first}">
								<div class="item active">
							</c:if>
						
							<c:if test="${not loopVariable.first}">
								<div class="item">
							</c:if>
							
									<img style="width: 100%" src="<c:url value="/assets/web/img/${slide.image}"/>" 
									alt="bootstrap ecommerce templates">
									<div class="carousel-caption">
										<h4>${slide.caption}</h4>
										<p>
											<span>${slide.content}</span>
										</p>
									</div>
								</div>
						
						</c:forEach>
						
					</div>
					<a class="left carousel-control" href="#myCarousel"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#myCarousel" data-slide="next">&rsaquo;</a>
				</div>
			</div>
			
			<!--New Products-->
			<div class="well well-small">
				<h3>Các sản phẩm mới</h3>
				<hr class="soften" />
				<div class="row-fluid">
					<div id="newProductCar" class="carousel slide">
						
<div class="carousel-inner">
	<c:if test="${productList.size() > 0}">
	
		<div class="item active">
			<ul class="thumbnails">
				<c:forEach var="product" items="${productList}" varStatus="loopVariable">
				
					<li class="span3">
						<div class="thumbnail">
							<a class="zoomTool" href="product_details.html" title="add to cart">
								<span class="icon-search"></span> <span>Vào xem</span>
							</a>
							<a href="#" class="tag"></a> 
							<a href="product_details.html"><img src="<c:url value="/assets/web/img/${product.image}"/>"></a>
						</div>
					</li>
				
				<c:if test="${(loopVariable.index + 1) % 4 == 0 || (loopVariable.index + 1) == productList.size()}">
			</ul>
		</div>
					<c:if test="${(loopVariable.index + 1) < productList.size()}">
		<div class="item">
			<ul class="thumbnails">
					</c:if>
				</c:if>
			</c:forEach>
	</c:if>
	
</div>

						
						<a class="left carousel-control" href="#newProductCar"
							data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
							href="#newProductCar" data-slide="next">&rsaquo;</a>
					</div>
				</div>
				<div class="row-fluid">
					
				</div>
			</div>
			
			<!-- Featured Products -->
			<div class="well well-small">
			
				<h3>
					<a class="btn btn-mini pull-right" href="products.html" title="View more">
						<span>Xem thêm</span><span class="icon-plus"></span>
					</a>
					<span>Sản phẩm nổi bật</span>
				</h3>
				
				<hr class="soften" />
				
				<div class="row-fluid">
					<c:if test="${productList.size() > 0}">
						<ul class="thumbnails">
							<c:forEach var="product" items="${productList}" varStatus="loopVariable">
								<li class="span4">
									<div class="thumbnail">
									
										<a class="zoomTool" href="product_details.html" title="add to cart">
											<span class="icon-search"></span>
											<span>Vào xem</span>
										</a> 
										
										<a href="product_details.html">
											<img src="<c:url value="/assets/web/img/${product.image}"/>" alt="">
										</a>
										
										<div class="caption">
											<h5>${product.name}</h5>
											<h4>
												<a class="defaultBtn" href="product_details.html" title="Click to view">
													<span class="icon-zoom-in"></span>
												</a>
												
												<a class="shopBtn" href="#" title="add to cart">
													<span class="icon-plus"></span>
												</a> 
													<span class="pull-right">$22.00</span>
											</h4>
										</div>
										
									</div>
								</li>
								<c:if test="${(loopVariable.index + 1) % 3 == 0 || (loopVariable.index + 1) == productList.size()}">
									</ul>
									<c:if test="${(loopVariable.index + 1) < productList.size()}">
										<ul class="thumbnails">
									</c:if>
								</c:if>
							</c:forEach>
					</c:if>
				</div>
				
			</div>

			<div class="well well-small">
				<a class="btn btn-mini pull-right" href="#">View more <span
					class="icon-plus"></span></a> Popular Products
			</div>
			
			<hr>
			
			<div class="well well-small">
				<a class="btn btn-mini pull-right" href="#">View more <span
					class="icon-plus"></span></a> Best selling Products
			</div>
		</div>
	</div>

</body>