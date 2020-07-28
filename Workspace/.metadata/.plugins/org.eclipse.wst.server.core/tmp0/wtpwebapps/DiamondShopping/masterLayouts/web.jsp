<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<title><decorator:title/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		<link href="<c:url value="/assets/web/css/bootstrap.css"/>" rel="stylesheet" />
		<link href="<c:url value="/assets/web/css/style.css"/>" rel="stylesheet"/>
		<link href="<c:url value="/assets/web/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
		<link href="<c:url value="/assets/web/font-awesome/ico/favicon.ico"/>" rel="shortcut icon"/>
	</head>

	<body>
		
		<%@include file="/common/components/web/UpperHeader.jsp"%>
	
		<div class="container">
			
			<%@include file="/common/components/web/LowerHeader.jsp"%>
	
			<%@include file="/common/components/web/Navigation.jsp"%>
			
			<decorator:body/>
			
			<%@include file="/common/components/web/Footer.jsp"%>
			
		</div>
		<!-- /container -->
	
		<%@include file="/common/components/web/CopyRight.jsp"%>
		
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="<c:url value="/assets/web/js/jquery.js"/>"></script>
		<script src="<c:url value="/assets/web/js/bootstrap.min.js"/>"></script>
		<script src="<c:url value="/assets/web/js/jquery.easing-1.3.min.js"/>"></script>
		<script src="<c:url value="/assets/web/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
		<script src="<c:url value="/assets/web/js/shop.js"/>"></script>
		
	</body>
</html>