package com.ecommerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String productName;
String brandName;
long productPrice;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String productName, String brandName, long productPrice) {
	this.id = id;
	this.productName = productName;
	this.brandName = brandName;
	this.productPrice = productPrice;
}
public int getId() {
	return id;
}
public String getProductName() {
	return productName;
}
public String getBrandName() {
	return brandName;
}
public long getProductPrice() {
	return productPrice;
}
public void setId(int id) {
	this.id = id;
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
	return "Product [id=" + id + ", productName=" + productName + ", brandName=" + brandName + ", productPrice="
			+ productPrice + "]";
}


}
