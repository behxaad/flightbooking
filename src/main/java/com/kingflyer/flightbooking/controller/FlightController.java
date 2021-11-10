package com.kingflyer.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.DAO.FareDao;

import com.kingflyer.flightbooking.DAO.FlightDao;

import com.kingflyer.flightbooking.entity.Flight;

@RestController
@RequestMapping("/api")
public class FlightController {

	@Autowired
	FlightDao repo;

	@Autowired
	FareDao fleetrepo;

	@Autowired
	FareDao farerepo;

	@GetMapping("/user/search_flight")
	public List<Flight> getAllFlight() {
		return this.repo.findAll();

	}

	@PostMapping("/admin/addflight")
	public Flight createUser(@RequestBody Flight flight) {
		return this.repo.save(flight);
	}

	@PutMapping("/admin/modify_flight")
	public Flight createUser1(@RequestBody Flight flight) {
		return this.repo.save(flight);
	}

	@DeleteMapping("/delete_flight/{flightId}")
	public String delete(@PathVariable("flightId") int flightId) {
		Flight p = repo.getOne(flightId);
		repo.delete(p);
		return "Deleted User Details";
	}

	/*
	 * @DeleteMapping("/delete_flight/{flightId}") public Map<String, Boolean>
	 * deleteFlight(@PathVariable(value = "flightId") int flightId) throws
	 * AttributeNotFoundException { Flight flight = repo.findById(flightId)
	 * .orElseThrow(() -> new
	 * AttributeNotFoundException("Flight not found for this id :: " + flightId));
	 * 
	 * repo.delete(flight); Map<String, Boolean> response = new HashMap<>();
	 * response.put("deleted", Boolean.TRUE); return response; }
	 * 
	 */

}
