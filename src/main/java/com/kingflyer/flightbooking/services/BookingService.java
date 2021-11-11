package com.kingflyer.flightbooking.services;

import java.util.List;

import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.Passenger;

public interface BookingService {

	boolean bookTicket(Booking booking, List<Passenger> passengers);

}
