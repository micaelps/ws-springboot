package com.ws.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	

}
