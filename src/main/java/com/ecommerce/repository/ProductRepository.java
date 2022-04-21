package com.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.beans.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
  Optional<List<Product>> findByProductNameLike(String productName , Pageable pageable);
}
