package com.ws.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	

}
