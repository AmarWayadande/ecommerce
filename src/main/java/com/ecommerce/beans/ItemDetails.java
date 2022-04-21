package com.ecommerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemDetails {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int itemId;
	  private int productId;
	  private String productName;
	  private int quantity;
	public ItemDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDetails(int itemId, int productId, String productName, int quantity) {
		this.itemId = itemId;
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
	}
	public int getItemId() {
		return itemId;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	@Override
	public String toString() {
		return "ItemDetails [itemId=" + itemId + ", productId=" + productId + ", productName=" + productName
				+ ", quantity=" + quantity + "]";
	}
	  
	  
}
