package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;

public interface FlightDao {
	public boolean newFlight(Flight flight);
	public List<Flight> searchFlight(Location location,Location location1,java.sql.Date travelDate);
	public boolean updateRemainingSeats(Flight flight);
	public List<Flight> getAll();
	public Flight getFlight(int flightId);

}
