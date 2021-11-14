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
		return flightDao.createFlight(flight);
	}

	@Override
	public boolean deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		return flightDao.updateRemainingSeats(flightId);
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flightDao.getAllFlight();
	}

	@Override
	public boolean addFleet(Fleet fleet) {
		// TODO Auto-generated method stub
		return fleetDao.createFleet(fleet);
	}

	@Override
	public boolean modifyFleet(Fleet fleet) {
		// TODO Auto-generated method stub
		return fleetDao.modifyFleet(fleet);
	}

	@Override
	public boolean deleteFleet(int fleetId) {
		// TODO Auto-generated method stub
		return fleetDao.deleteFleet(fleetId);
	}

	@Override
	public List<Fleet> getAllFleets() {
		// TODO Auto-generated method stub
		return fleetDao.getAllFleet();
	}

	@Override
	public boolean addfare(Fare fare) {
		// TODO Auto-generated method stub
		return fareDao.createFare(fare);
	}

	@Override
	public boolean modifyFare(Fare fare) {
		// TODO Auto-generated method stub
		return fareDao.modifyFare(fare);
	}

	@Override
	public List<Fare> getAllFares(Fare fare) {
		// TODO Auto-generated method stub
		return fareDao.getAllFare();
	}

	@Override
	public boolean addLocation(Location location) {
		// TODO Auto-generated method stub
		return locationDao.createLocation(location);
	}

	@Override
	public boolean modifyLocation(Location location) {
		// TODO Auto-generated method stub
		return locationDao.modifyLocation(location);
	}

	@Override
	public boolean deleteLocation(int locationId) {
		// TODO Auto-generated method stub
		return locationDao.deleteLocation(locationId);
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return locationDao.getAllLocation();
	}

}
