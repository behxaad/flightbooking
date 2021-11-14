package com.kingflyer.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kingflyer.flightbooking.dao.FareDao;
import com.kingflyer.flightbooking.dao.FleetDao;
import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.LocationDao;
import com.kingflyer.flightbooking.entity.Fare;
import com.kingflyer.flightbooking.entity.Fleet;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private FlightDao flightDao;
	@Autowired
	private FleetDao fleetDao;
	@Autowired
	private FareDao fareDao;
	@Autowired
	private LocationDao locationDao;

	@Override
	public boolean addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addFleet(Fleet fleet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyFleet(Fleet fleet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFleet(Fleet fleet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fleet> getAllFleets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyFare(Fare fare) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fare> getAllFares(Fare fare) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addLocation(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyLocation(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLocation(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
