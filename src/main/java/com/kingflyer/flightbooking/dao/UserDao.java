package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.User;

public interface UserDao {

	List<User> findAll();

	static User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	static User getUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	User save(User user);


}
