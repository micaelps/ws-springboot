package com.ws.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	

}
