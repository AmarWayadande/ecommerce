package com.ecommerce.beans;

public class ProductDto {

	String productName;
	String brandName;
	long productPrice;

	public String getProductName() {
		return productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductDto [productName=" + productName + ", brandName=" + brandName + ", productPrice=" + productPrice
				+ "]";
	}
	
	

}
