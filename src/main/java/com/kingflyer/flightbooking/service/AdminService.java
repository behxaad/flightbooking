package com.kingflyer.flightbooking.service;

import java.util.List;

import com.kingflyer.flightbooking.entity.Flight;

public interface AdminService {
	
	//Services related to flight
	
	public boolean addFlight(Flight flight);
	public boolean deleteFlight(int flightId);
	public Flight modifyFlight(Flight flight);
	public List<Flight> getAllFlights();

}

