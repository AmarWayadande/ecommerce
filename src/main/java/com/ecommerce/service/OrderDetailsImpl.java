package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ResourceNotFoundException;
import com.ecommerce.beans.Order;
import com.ecommerce.repository.OrderRepository;

@Service
public class OrderDetailsImpl implements OrderDetailService {

	 @Autowired
	 OrderRepository  orderRepository; 
	@Override
	public Order getOrderDetails(int orderNumber) {
		Order odr =  orderRepository.findById(orderNumber).orElseThrow(() -> new ResourceNotFoundException("orderNumber not found "+ orderNumber));
		 System.out.println(odr.getItemDetails().get(0).getProductId());
		return odr;
		
	}

}
