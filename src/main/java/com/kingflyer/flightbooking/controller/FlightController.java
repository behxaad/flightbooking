package com.kingflyer.flightbooking.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;
import com.kingflyer.flightbooking.service.FlightService;


@RestController
public class FlightController {
	@Autowired
	private FlightService flightService;

	@GetMapping("/flight/getFlight/{flightId}")
	@ExceptionHandler(RecordNotFoundException.class)
	public Flight getFlight(@PathVariable("flightId") int flightId) {
		return flightService.getFlight(flightId);
	}

	@GetMapping("/flight/getSearchDetails/{departureId}&{arrivalId}&{date}")
	@ExceptionHandler(RecordNotFoundException.class)
	public List<Flight> getSearchDetails(@PathVariable("departureId") int departureId,@PathVariable("arrivalId")  int arrivalId,@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd")  Date date) {
		return flightService.getSearchDetails(departureId, arrivalId, date);
	}

	@GetMapping("/flight/getFare/{flightId}&{classType}")
	@ExceptionHandler(RecordNotFoundException.class)
	public double getFare(@PathVariable("flightId") int flightId, @PathVariable("classType") String classType) {
		return flightService.getFare(flightId, classType);
	}

	@GetMapping("/flight/getFlights")
	@ExceptionHandler(RecordNotFoundException.class)
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}
}