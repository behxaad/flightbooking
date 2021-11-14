package com.kingflyer.flightbooking.dao;

import com.kingflyer.flightbooking.entity.User;

public interface UserDao {
	
	public boolean addUser(User user);
	public boolean modifyUser(User user);
	public boolean deleteUser(String email);
	public User getUser(String email);
	
}
