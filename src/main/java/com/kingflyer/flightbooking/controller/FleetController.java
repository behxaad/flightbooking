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
import com.kingflyer.flightbooking.DAO.FleetDao;
import com.kingflyer.flightbooking.entity.Fleet;

	@RestController
	@RequestMapping("/api/v1")
	public class FleetController {

	@Autowired
		private FleetDao fleetRepository;
		
		
		@GetMapping ("/getfleet")
		public List<Fleet> getAllUser(){
			return this.fleetRepository.findAll();
		}
		
		@PostMapping("/addfleet")
		public Fleet createUser(@RequestBody Fleet fleet) {
			return this.fleetRepository.save(fleet);
		}
		@PutMapping("/modify_fleet")
		public Fleet update( Fleet fleet) {
			fleetRepository.save(fleet);
			return fleet;
		}
		@DeleteMapping("/delete_fleet")
		public String delete(@PathVariable("flightId") int fleet) {
			Fleet p = fleetRepository.getOne(fleet);
			fleetRepository.delete(p);
			return "Deleted User Details";
		}
		
		
	}



