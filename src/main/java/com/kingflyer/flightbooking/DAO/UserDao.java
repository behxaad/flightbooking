package com.kingflyer.flightbooking.DAO;

import com.kingflyer.flightbooking.entity.User;

public interface UserDao {
	public boolean addUser(User user);
	public boolean modifyUserDetails(User user);
	public User getUser(String emailAddress);
	public boolean deleteUser(String emailAddress);


}
