package com.ws.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	

}
