package com.devsuperior.ssrdsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ssrdsmovie.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	User findByEmail(String email);
	
}
