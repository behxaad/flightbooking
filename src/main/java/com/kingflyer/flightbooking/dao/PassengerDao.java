package com.kingflyer.flightbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kingflyer.flightbooking.entity.Passenger;

public interface PassengerDao extends CrudRepository<Passenger, Integer> {
	
//	public Passenger addPassenger(Passenger passenger);
//	public List<Passenger> getPassengers(int bookingId);

}
