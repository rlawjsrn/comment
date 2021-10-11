package co.yedam.homepage;

public class Coffee {
	private int prodId;
	private String prodName;
	private String productDescription;
	private String prodImage;
	private int originPrice;
	private int offPrice;
	private double likeIt;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	public int getOriginPrice() {
		return originPrice;
	}
	public void setOriginPrice(int originPrice) {
		this.originPrice = originPrice;
	}
	public int getOffPrice() {
		return offPrice;
	}
	public void setOffPrice(int offPrice) {
		this.offPrice = offPrice;
	}
	public double getLikeIt() {
		return likeIt;
	}
	public void setLikeIt(double likeIt) {
		this.likeIt = likeIt;
	}
	@Override
	public String toString() {
		return "Coffee [prodId=" + prodId + ", prodName=" + prodName + ", productDescription=" + productDescription
				+ ", prodImage=" + prodImage + ", originPrice=" + originPrice + ", offPrice=" + offPrice + ", likeIt="
				+ likeIt + "]";
	}
	
	
}
