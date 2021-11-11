/**
 * 
 */
package com.kingflyer.flightbooking.service;

import com.kingflyer.flightbooking.entity.User;

/**
 * @author pudaykir
 *
 */
public class UserServiceimplmplementation implements UserService {


	@Override
	public boolean addUser(User user) {
		userDAO.addUser(user);
		System.out.println("Deadpool");
		return false;
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEmail(String emailId) {
		User user = userDAO.getUser(emailId);
		if (user != null)
			return false;
		else
			return true;
	}

	@Override
	public boolean checkLogin(String emailId, String password) {
		User user = userDAO.getUser(emailId);
		if(user!=null)
		{
			String userPass=user.getPassword();
			if(userPass.equals(password))
				return true;
			else
				return false;
		}
		else
			return false;
	}

}
