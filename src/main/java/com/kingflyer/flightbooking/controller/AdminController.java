package com.kingflyer.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/admin/addFlight")
	public void addFlight(@RequestBody Flight flight) {

		adminService.addFlight(flight);
	}

	@DeleteMapping("/admin/deleteFlight/{flightId}")
	public String deleteFlight(@PathVariable("flightId") int flightId) {
		if (adminService.deleteFlight(flightId)) {
			return "Flight Deleted Sucessfully";
		}

		else
			return "Invalid Flight Id";

	}
	
	@PutMapping("/admin/modifyFlight")
	public void modifyFlight(@RequestBody Flight flight)
	{
		adminService.modifyFlight(flight);
	}
	
	@GetMapping("/admin/getFlights")
	public List<Flight> getAllFlights()
	{
		return adminService.getAllFlights();
	}
	

}
