package com.kingflyer.flightbooking.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kingflyer.flightbooking.dao.ContactDao;
import com.kingflyer.flightbooking.dao.UserDao;
import com.kingflyer.flightbooking.entity.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private ContactDao contactDao;

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HashMap<String, String>> getHistory(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkLogin(String emailId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
