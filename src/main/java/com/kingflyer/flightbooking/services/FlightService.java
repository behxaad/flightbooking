package com.kingflyer.flightbooking.services;

import java.sql.Date;
import java.util.List;

import com.kingflyer.flightbooking.entity.Flight;

public interface FlightService {

	int getFare(int flightId, String classType);

	Flight getFlightForDisplay(int id);

	List<Flight> getSearchDetails(int src, int dst, Date dt);

}
