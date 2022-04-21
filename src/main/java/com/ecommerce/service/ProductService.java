package com.ecommerce.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.ecommerce.beans.Product;
import com.ecommerce.beans.User;

public interface ProductService {
public Product save1(Product pr);
public List<Product> searchProductByName(String productName);
public Product  findbyid(int id);
public User saveUser(User user);
}
