package com.kingflyer.flightbooking.dao;

import java.util.Date;
import java.util.List;

import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;

public class FlightDaoImpl implements FlightDao {

	@Override
	public boolean createFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flight> searchFlight(Location departureLocation, Location arrivalLocation, Date travelDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlight(int flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRemainingSeats(int flightId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return null;
	}

}
