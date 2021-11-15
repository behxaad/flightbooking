package com.kingflyer.flightbooking.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.kingflyer.flightbooking.entity.Contact;
import com.kingflyer.flightbooking.entity.User;

public interface UserService {

	public boolean addUser(User user);
	public User modifyUser(User user);
	public List<HashMap<String, String>> getHistory(int userId);
	public boolean checkLogin(String email, String password);
	public User getUser(String email);
	public boolean addContact(Contact contact);

}
