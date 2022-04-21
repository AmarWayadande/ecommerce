package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.beans.Product;
import com.ecommerce.beans.ProductDto;
import com.ecommerce.beans.User;
import com.ecommerce.service.ProductServiceImpl;



@RestController
public class ProductController {
	@Autowired
	ProductServiceImpl primpl;

	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product)
	{		
		return primpl.save1(product);	
	}
	@PostMapping("/saveUser")
	public User User(@RequestBody User user)
	{		
		return primpl.saveUser(user);	
	}
	
	@GetMapping("/SearchProduct")
	public ResponseEntity<List<ProductDto>> searchProduct(@RequestParam String productName )
	{	   	
		//return primpl.searchProductByName(productName) ;	
		List<Product> pro1 =  primpl.searchProductByName(productName);
		System.out.println(pro1.toString());
		List<ProductDto> productDto = new ArrayList<ProductDto> ();
		
		for (Product product1 : pro1) {
			ProductDto dto = new ProductDto();
			dto.setProductName(product1.getProductName());
			dto.setBrandName(product1.getBrandName());
			dto.setProductPrice(product1.getProductPrice());
			productDto.add(dto);
		}
		//BeanUtils.copyProperties(productDto,pro1);
		//System.out.println(productDto.toString());
		return ResponseEntity.ok(productDto);
	}
	
	@GetMapping("/findbyID/{id}")
	public Product searchProduct(@PathVariable int id )
	{   	
		return primpl.findbyid(id);	
	}
	
	
}
