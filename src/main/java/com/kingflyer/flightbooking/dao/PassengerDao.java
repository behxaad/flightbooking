package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Passenger;

public interface PassengerDao {
	
	public Passenger addPassenger(Passenger passenger);
	public List<Passenger> getPassengers(int bookingId);

}
