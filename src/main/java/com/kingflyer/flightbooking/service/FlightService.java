package com.kingflyer.flightbooking.service;

import java.util.Date;
import java.util.List;

import com.kingflyer.flightbooking.entity.Flight;

public interface FlightService {
	
	public List<Flight> getSearchDetails(int sourceId, int destinationId, Date date, String city);
	public Flight getFlight(int flightId);

}
