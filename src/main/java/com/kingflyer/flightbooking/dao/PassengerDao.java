package com.kingflyer.flightbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Passenger;

@Repository
public interface PassengerDao extends CrudRepository<Passenger, Integer> {
	
//	public Passenger addPassenger(Passenger passenger);
//	public List<Passenger> getPassengers(int bookingId);

}
