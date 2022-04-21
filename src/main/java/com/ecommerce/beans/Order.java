package com.ecommerce.beans;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private LocalDate orderDate;
	private int userId;
	@OneToMany(cascade = CascadeType.ALL)
	private List<ItemDetails> ItemDetails ;
	private long totalPrice ; 
	private long accountNumber;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, LocalDate orderDate, int userId, List<com.ecommerce.beans.ItemDetails> itemDetails,
			long totalPrice, long accountNumber) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.userId = userId;
		ItemDetails = itemDetails;
		this.totalPrice = totalPrice;
		this.accountNumber = accountNumber;
	}
	public int getOrderId() {
		return orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public int getUserId() {
		return userId;
	}
	public List<ItemDetails> getItemDetails() {
		return ItemDetails;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setItemDetails(List<ItemDetails> itemDetails) {
		ItemDetails = itemDetails;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", userId=" + userId + ", ItemDetails="
				+ ItemDetails + ", totalPrice=" + totalPrice + ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	
	
	
}
