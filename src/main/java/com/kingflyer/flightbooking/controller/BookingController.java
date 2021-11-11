package com.kingflyer.flightbooking.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.Dao.BookingRepo;
import com.kingflyer.flightbooking.entity.Booking;




@RestController
@RequestMapping("/api/user")
public class BookingController {
	

	@Autowired
	BookingRepo repo;
	
	
	@PostMapping("/Book_Ticket")
	public Booking createbook(@RequestBody Booking user) {
		//getAllFlight();
		return this.repo.save(user);
		
	}
	
	
	
	@DeleteMapping("/cancel_booking/{book_id}")
	public String delete(@PathVariable("book_id") int book_id) {
		Booking p = repo.getOne(book_id);
		repo.delete(p);
		return "Deleted User Details";
	}

	/* @DeleteMapping("/cancel_booking/{book_id}")
	    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "book_id") int book_id)
	         throws AttributeNotFoundException {
		 Booking  booking = repo.findById(book_id)
	       .orElseThrow(() -> new AttributeNotFoundException("Booking not found for this id :: " + book_id));

	    	repo.delete(booking);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }*/
}

