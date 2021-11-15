package com.kingflyer.flightbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
//	@Query(value = "SELECT * FROM User WHERE email = :email", nativeQuery = true)
	public User findByEmail(@Param("email") String email);
	
}
