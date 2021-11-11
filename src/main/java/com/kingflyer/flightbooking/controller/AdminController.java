package com.kingflyer.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kingflyer.flightbooking.dao.AdminDao;

@RestController
public class AdminController {

	@Autowired
	AdminDao repo;

	@PostMapping("/add_admin")
	public Admin home1(Admin location) {
		repo.save(location);
		return location;
	}

}
