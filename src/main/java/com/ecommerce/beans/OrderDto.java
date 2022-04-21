package com.ecommerce.beans;

import java.util.List;

public class OrderDto {
	private int userId;
	private long totalPrice;
	private long accountNumber;
	private List<ItemDetailsDto> ItemDetailsDto;
	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDto(int userId, long totalPrice, long accountNumber,
			List<com.ecommerce.beans.ItemDetailsDto> itemDetailsDto) {
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.accountNumber = accountNumber;
		ItemDetailsDto = itemDetailsDto;
	}
	public int getUserId() {
		return userId;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public List<ItemDetailsDto> getItemDetailsDto() {
		return ItemDetailsDto;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setItemDetailsDto(List<ItemDetailsDto> itemDetailsDto) {
		ItemDetailsDto = itemDetailsDto;
	}
	@Override
	public String toString() {
		return "OrderDto [userId=" + userId + ", totalPrice=" + totalPrice + ", accountNumber=" + accountNumber
				+ ", ItemDetailsDto=" + ItemDetailsDto + "]";
	}

	
}
