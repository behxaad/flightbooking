package com.kingflyer.flightbooking.service;

import java.util.List;

import com.kingflyer.flightbooking.entity.Fare;
import com.kingflyer.flightbooking.entity.Fleet;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;

public interface AdminService {
	
	//Services related to flight
	public boolean addFlight(Flight flight);
	public boolean deleteFlight(int flightId);
	public List<Flight> getAllFlights();
	
	//Services related to fleet
	public boolean addFleet(Fleet fleet);
	public boolean modifyFleet(Fleet fleet);
	public boolean deleteFleet(int fleetId);
	public List<Fleet> getAllFleets();
	
	//Service related to fare
	public boolean addfare(Fare fare);
	public boolean modifyFare(Fare fare);
	public List<Fare> getAllFares(Fare fare);
	
	//Services related to location
	public boolean addLocation(Location location);
	public boolean modifyLocation(Location location);
	public boolean deleteLocation(int locationId);
	public List<Location> getAllLocations();

}

