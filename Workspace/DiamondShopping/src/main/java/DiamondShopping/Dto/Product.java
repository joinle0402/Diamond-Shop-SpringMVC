package DiamondShopping.Dto;

import java.util.Date;

public class Product {

	private long idProduct;
	private int idCategory;
	private String sizes;
	private String name;
	private double price;
	private int sale;
	private String title;
	private boolean featuredProduct;
	private boolean newProduct;
	private String detail;
	private int idColor;
	private String nameColor;
	private String codeColor;
	private String image;
	private Date createdAt;
	private Date updatedAt;

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isFeaturedProduct() {
		return featuredProduct;
	}

	public void setFeaturedProduct(boolean featuredProduct) {
		this.featuredProduct = featuredProduct;
	}

	public boolean isNewProduct() {
		return newProduct;
	}

	public void setNewProduct(boolean newProduct) {
		this.newProduct = newProduct;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getIdColor() {
		return idColor;
	}

	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}

	public String getNameColor() {
		return nameColor;
	}

	public void setNameColor(String nameColor) {
		this.nameColor = nameColor;
	}

	public String getCodeColor() {
		return codeColor;
	}

	public void setCodeColor(String codeColor) {
		this.codeColor = codeColor;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", idCategory=" + idCategory + ", sizes=" + sizes + ", name=" + name
				+ ", price=" + price + ", sale=" + sale + ", title=" + title + ", featuredProduct=" + featuredProduct
				+ ", newProduct=" + newProduct + ", detail=" + detail + ", idColor=" + idColor + ", nameColor="
				+ nameColor + ", codeColor=" + codeColor + ", image=" + image + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

}
