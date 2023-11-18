package com.pos.backposapp.repositories;

import com.pos.backposapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// ProductRepository.java
public interface ProductRepository extends JpaRepository<Product, Long> {
}

