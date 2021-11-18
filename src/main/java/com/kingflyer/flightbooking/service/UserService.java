package com.kingflyer.flightbooking.service;

import com.kingflyer.flightbooking.entity.User;

public interface UserService {

	public boolean addUser(User user);
	public User modifyUser(User user);
	public boolean checkLogin(String email, String password);
	public User getUser(String email);

}
