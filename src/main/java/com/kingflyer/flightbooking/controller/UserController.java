package com.kingflyer.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.entity.User;
import com.kingflyer.flightbooking.exceptions.RecordAlreadyPresentException;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;
import com.kingflyer.flightbooking.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
	
	@GetMapping("/getUser/{email}")
	@ExceptionHandler(RecordNotFoundException.class)
	public User getUser(@PathVariable("email") String email)
	{ 
		return userService.getUser(email);
	}
	
	@PutMapping("/modifyUser")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyUser(@RequestBody User user)
	{
		userService.modifyUser(user);
	}
	
	@GetMapping("/checkLogin/{email}&{password}")
	@ExceptionHandler(RecordNotFoundException.class)
	public String checkLogin(@PathVariable("email") String email,@PathVariable("password") String password)
	{
		if(userService.checkLogin(email, password))
		{
			return "Login Successfull";
		}
		
		else
			return "Invalid Crediantials";
	}
		

}