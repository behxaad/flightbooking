package com.kingflyer.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.Passenger;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;
import com.kingflyer.flightbooking.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingservice;
	
	@GetMapping("/booking/checkSeatAvailability")
	@ExceptionHandler(RecordNotFoundException.class)
	public String checkSeatAvailability(@PathVariable int flightId,@PathVariable int seatsRequired,@PathVariable("classType") String classType)
	{
		if(bookingservice.checkSeatAvailability(flightId, seatsRequired, classType))
		{
			return "seats are available";
		}
		else
		{
			return "seats are full";
		}
	}
	
	@PostMapping("/booking/bookTicket")
	@ExceptionHandler(RecordNotFoundException.class)
	public String bookTicket(@RequestBody Booking booking,@PathVariable List<Passenger> passengers)
	{
		if(bookingservice.bookTicket(booking, passengers))
		{
			return "your ticket is booked";
		}
		else
		{
			return " tickets are unavailable";
		}
	}
	
	@DeleteMapping("/booking/cancelTicket/{id}")
	public String cancelTicket(@PathVariable int bookingId)
	{
		if(bookingservice.cancelTicket(bookingId))
		{
			return "ticket is cancelled";
		}
		else
		{
			return "ticket is not cancelled";
		}
	}
	
	@PutMapping("/booking/updateseat/{seat}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void updateseat(@PathVariable int flightId,@PathVariable int seat,@PathVariable  String classType) {
		bookingservice.updateSeat(flightId, seat, classType);
	}
	

}