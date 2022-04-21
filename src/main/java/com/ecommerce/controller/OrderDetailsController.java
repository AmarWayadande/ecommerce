package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.beans.Order;
import com.ecommerce.service.OrderDetailsImpl;

@RestController
public class OrderDetailsController {
	@Autowired
	OrderDetailsImpl  orderDetailsImpl;
	
	@PostMapping("/showOrderDetails")
	public ResponseEntity<Order> fetchOrderDetails(@RequestParam int ordernumber)
	{
		//return orderDetailsImpl.getOrderDetails(ordernumber);	
		return  ResponseEntity.ok(orderDetailsImpl.getOrderDetails(ordernumber));
	}

}
