package com.kingflyer.flightbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	
//	public boolean addUser(User user);
//	public boolean modifyUser(User user);
//	public boolean deleteUser(String email);
//	@Query(value = "SELECT * FROM User WHERE email = :email", nativeQuery = true)
	public User findByEmail(@Param("email") String email);
	
}
