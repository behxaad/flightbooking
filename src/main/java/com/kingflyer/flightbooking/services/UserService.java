/**
 * 
 */
package com.kingflyer.flightbooking.services;

import com.kingflyer.flightbooking.entity.User;

/**
 * @author pudaykir
 *
 */
public interface UserService {
	
	public boolean addUser(User user);
	public boolean modifyUser(User user);
	public boolean verifyEmail(String emailId);
	public boolean checkLogin(String emailId, String password);

	


}
