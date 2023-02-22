package com.fullstackbackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	Optional<User> findByEmailAndPassword(String email,String password);

	Optional<User> findByEmail(String email);
	
//    @Query("SELECT u FROM User u WHERE u.email = ?1")
//    public User findByEmail(String email);
//	
	
}
