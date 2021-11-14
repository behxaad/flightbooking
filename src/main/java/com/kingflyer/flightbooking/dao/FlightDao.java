package com.kingflyer.flightbooking.dao;

import java.util.Date;
import java.util.List;

import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;

public interface FlightDao {
	
	public boolean createFlight(Flight flight);
	public List<Flight> searchFlight(Location departureLocation, Location arrivalLocation, Date travelDate);
	public Flight getFlight(int flightId);
	public boolean updateRemainingSeats(int flightId);
	public List<Flight> getAllFlight();

}
