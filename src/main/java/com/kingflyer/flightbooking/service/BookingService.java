package com.kingflyer.flightbooking.service;

import java.util.List;

import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.Passenger;

public interface BookingService {
	
	public boolean bookTicket(Booking booking, List<Passenger> passengers);
	public boolean cancelTicket(int bookingId);
	public String checkSeatAvailability(int flightId, int seatsRequired, String classType);
	public boolean updateSeat(int flightMasterId,int seat,String classType);
	
}
