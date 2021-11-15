package com.kingflyer.flightbooking.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.dao.ContactDao;
import com.kingflyer.flightbooking.dao.UserDao;
import com.kingflyer.flightbooking.entity.Contact;
import com.kingflyer.flightbooking.entity.User;
import com.kingflyer.flightbooking.exceptions.RecordAlreadyPresentException;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {

		Optional<User> checkUser = userDao.findById(user.getId());
		if (!checkUser.isPresent()) {
			userDao.save(user);
			return true;
		}

		else
			throw new RecordAlreadyPresentException("User with Id:" + user.getId() + " Already Exist");
	}

	@Override
	public User modifyUser(User user) {

		Optional<User> checkUser = userDao.findById(user.getId());
		if (checkUser.isPresent()) {
			userDao.save(user);
		} else
			throw new RecordNotFoundException("User with Id: " + user.getId() + " not exists!!");
		return user;
	}

	@Override
	public List<HashMap<String, String>> getHistory(int userId) {

		return null;

	}

	@Override
	public boolean checkLogin(String email, String password) {

		User user = userDao.findByEmail(email);
		if (user != null) {
			String userPass = user.getPassword();
			if (userPass.equals(password)) {
				return true;
			}

			else
				return false;
		}

		else
			return false;
	}

	@Override
	public User getUser(String email) {

		User checkUser = userDao.findByEmail(email);
		if (checkUser != null) {
			return checkUser;
		} else
			throw new RecordNotFoundException("No record found with Email: " + email);

	}


}
