package com.kingflyer.flightbooking.service;

import java.util.HashMap;
import java.util.List;

import com.kingflyer.flightbooking.entity.User;

public interface UserService {

	public boolean addUser(User user);
	public User modifyUser(User user);
	public List<HashMap<String, String>> getHistory(int userId);
	public boolean checkLogin(String email, String password);
	public User getUser(String email);

}
