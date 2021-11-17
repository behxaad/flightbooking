package com.kingflyer.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.entity.CreateBooking;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;
import com.kingflyer.flightbooking.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@GetMapping("/booking/checkSeatAvailability/{flightId}&{seatsRequired}&{classType}")
	@ExceptionHandler(RecordNotFoundException.class)
	public String checkSeatAvailability(@PathVariable int flightId, @PathVariable int seatsRequired,
			@PathVariable String classType) {
		String availability = bookingService.checkSeatAvailability(flightId, seatsRequired, classType);
		return availability;
	}

	@PostMapping("/booking/bookTicket")
	@ExceptionHandler(RecordNotFoundException.class)
	public String bookTicket(@RequestBody CreateBooking booking) {
		bookingService.bookTicket(booking.getBooking(), booking.getPassengers());
			return "Ticket Booked Successfully";
		
	}

	@DeleteMapping("/booking/cancelTicket/{bookingId}")
	public String cancelTicket(@PathVariable int bookingId) {
		bookingService.cancelTicket(bookingId);
		return "ticket is cancelled";
	}

	@PutMapping("/booking/updateseat/{flightId}&{seat}&{classType}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void updateseat(@PathVariable int flightId, @PathVariable int seat, @PathVariable String classType) {
		bookingService.updateSeat(flightId, seat, classType);

	}

}