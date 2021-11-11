package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Flight;

public interface FlightDao {

	List<Flight> findAll();

	Object findById(int flightId);

	com.kingflyer.flightbooking.entity.Flight save(com.kingflyer.flightbooking.entity.Flight flight);

	void delete(Flight flight);

	Flight getOne(int flightId);

}
