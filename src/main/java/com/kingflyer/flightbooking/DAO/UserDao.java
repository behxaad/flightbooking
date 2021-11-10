package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.User;

public interface UserDao {

	List<User> findAll();

	User save(User user);

}
