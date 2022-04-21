package com.ecommerce.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class ItemDetailsDto {

	private int productId;
	private String productName;
	private int quantity;
    
	@Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
