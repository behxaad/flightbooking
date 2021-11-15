package com.kingflyer.flightbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.kingflyer.flightbooking.entity.User;

public interface UserDao extends CrudRepository<User, Integer> {
	
//	public boolean addUser(User user);
//	public boolean modifyUser(User user);
//	public boolean deleteUser(String email);
	@Query(value = "SELECT * FROM User WHERE email = ?1", nativeQuery = true)
	public User findByEmail(String email);
	
}
