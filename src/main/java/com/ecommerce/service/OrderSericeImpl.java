package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.beans.ItemDetails;
import com.ecommerce.beans.Order;
import com.ecommerce.beans.Product;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.repository.ProductRepository;

@Service
public class OrderSericeImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	TransactionFiegn  transactionFiegn; 

	@Override
	public Order saveOrder(Order order) {
		System.out.println(order.getTotalPrice());
		List<ItemDetails> ite = order.getItemDetails();
		
		long totalAmt = 0;
		int qty=0;
		Boolean flag =false;
		String msg=null;
		for (ItemDetails itemDetails : ite) {
			 qty = itemDetails.getQuantity();
			System.out.println("itemDetails    " + itemDetails.getProductId());
			int id = itemDetails.getProductId();
			Optional<Product> pr = productRepository.findById(id);
			System.out.println(pr.get());
			if (pr.isPresent()) 
			{
				totalAmt += pr.get().getProductPrice() * qty;
				System.out.println("totalAmt " + totalAmt);
				
			}
			pr = null;
			flag=true;
		}
		
		if(flag)
		{
			msg = transactionFiegn.transaction(order.getAccountNumber(),765379544,totalAmt);
			System.out.println(msg);
		}
		System.out.println(msg);
		order.setTotalPrice(totalAmt);
		return orderRepository.save(order);
	}

}
