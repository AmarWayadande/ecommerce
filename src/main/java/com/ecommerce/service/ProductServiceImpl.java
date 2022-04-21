package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.ResourceNotFoundException;
import com.ecommerce.beans.Product;
import com.ecommerce.beans.User;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.UserRepository;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  ProductRepository  productRepository;
  
  @Autowired
  UserRepository  userRepository;
  
 
	@Override
	public Product save1(Product pr) {
		// TODO Auto-generated method stub
		return productRepository.save(pr);
	}
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<Product> searchProductByName(String productName) {
		Pageable pageable = PageRequest.of(0, 10);
		//return productRepository.findByProductNameLike(productName, pageable);
		List<Product> pro =	productRepository.findByProductNameLike(productName, pageable).orElseThrow(() -> new ResourceNotFoundException("Product out of stock" + productName));
	     //System.out.println(pro.get(0).getProductName()); 
		  
		return pro;
	}

	@Override
	public Product findbyid(int id) {
		Optional<Product> pr =productRepository.findById(id);	
		return pr.get();
	}

}
