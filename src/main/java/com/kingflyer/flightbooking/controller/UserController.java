package com.kingflyer.flightbooking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kingflyer.flightbooking.dao.UserDao;
import com.kingflyer.flightbooking.entity.User;
@RestController
	@RequestMapping("/api/user")
	public class UserController {

		@Autowired
		private UserDao userRepository;
	
		@GetMapping("/getuser")
		public List<User> getAllUser(){
			return this.userRepository.findAll();
		}
		
		@PostMapping("/adduser")
		public User createUser(@RequestBody User user) {
			return this.userRepository.save(user);
		}
		
		
		
	}



