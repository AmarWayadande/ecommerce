package com.ecommerce.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.beans.ItemDetails;
import com.ecommerce.beans.ItemDetailsDto;
import com.ecommerce.beans.Order;
import com.ecommerce.beans.OrderDto;
import com.ecommerce.service.OrderSericeImpl;

@RestController
public class BuyProductController {

	@Autowired
	OrderSericeImpl orderSericeImpl;
    
	/*
	 * @PostMapping("/buyProduct") public Order BuyProduct(@RequestBody Order order)
	 * { System.out.println("init obj"+ order.getTotalPrice()); return
	 * orderSericeImpl.saveOrder(order);
	 * 
	 * }
	 */
	@PostMapping("/buyProduct")
	public Order BuyProduct(@Valid @RequestBody OrderDto orderDto)
	{		
		System.out.println("init obj"+ orderDto.getTotalPrice());
		
		Order odr = new  Order();
		//ItemDetails item;
		List<ItemDetails>itemlist = new ArrayList<>();
		odr.setAccountNumber(orderDto.getAccountNumber());
		odr.setUserId(orderDto.getUserId());
		odr.setOrderDate(LocalDate.now());
		odr.setTotalPrice(orderDto.getTotalPrice());
		for (ItemDetailsDto itemDetails : orderDto.getItemDetailsDto()) {
			ItemDetails item = new ItemDetails();
			System.out.println("itemDetails.getProductId()" + itemDetails.getProductId());
			item.setProductId(itemDetails.getProductId());
			item.setProductName(itemDetails.getProductName());
	        item.setQuantity(itemDetails.getQuantity());
	        itemlist.add(item);
	        System.out.println(itemlist.get(0).getProductId());
		}
		
        odr.setItemDetails(itemlist);
        System.out.println(odr.toString());
		return orderSericeImpl.saveOrder(odr);
		
		

	}

}
