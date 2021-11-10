package com.Kingflightbooking.services;

import java.util.List;

import com.operations.Fare;
import com.operations.Fleet;
import com.operations.Flight;
import com.operations.Location;

public class AdminServiceImplementation implements AdminServices {
	
	private FlightDAO flightDAO=new FlightImplementation();
	
	
	@Override
	public boolean addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean deleteLocation(int locationId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Location> getAllLocationDetail() {
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
	public boolean deleteFleet(int fleetId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fleet> getAllFleetDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyFare(Fare fare) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fare> getAllFareDetail(Fare fare) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	

}
