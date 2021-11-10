/**
 * 
 */
package com.Kingflightbooking.services;


import com.operations.User;

/**
 * @author rochitya
 *
 */
public interface UserService {
	public boolean checkLogin(String emailId,String password);
	
	public boolean addUser(User user);
	public boolean modifyUser(User user);

}
