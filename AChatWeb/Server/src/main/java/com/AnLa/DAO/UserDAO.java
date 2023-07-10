package com.AnLa.DAO;
//Make by Bình An || AnLaVN || KatoVN

import org.springframework.data.jpa.repository.JpaRepository;

import com.AnLa.Entity.User;

public interface UserDAO extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
	
	boolean existsByEmail(String email);
	
	boolean existsByEmailAndActivated(String email, Boolean activated);
	
}