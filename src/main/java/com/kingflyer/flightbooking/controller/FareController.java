package com.kingflyer.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kingflyer.flightbooking.DAO.FareDao;
import com.kingflyer.flightbooking.entity.Fare;

@RestController
@RequestMapping("/api/admin")
public class FareController {

	@Autowired
	FareDao repo;
	
	
	@PostMapping("/add_fare")
	public Fare home1(Fare  fare) {
		repo.save(fare);
		return fare;
	}
	
	
	@PutMapping("/modify_fare")
	public Fare update( Fare  fare) {
		repo.save(fare);
		return fare;
	}
	
	
}
