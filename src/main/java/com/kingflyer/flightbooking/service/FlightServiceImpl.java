package com.kingflyer.flightbooking.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.LocationDao;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightDao flightDao;
	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Flight> getSearchDetails(int sourceId, int destinationId, Date date) {
		// TODO Auto-generated method stub
		Optional<Location> source = locationDao.findById(sourceId);
		Optional<Location> destination = locationDao.findById(destinationId);
		List<Flight> flights = flightDao.searchFlight(source, destination, date);
		return flights;
	}

	@Override
	public Flight getFlight(int flightId) {
		// TODO Auto-generated method stub
		Optional<Flight> checkFlight = flightDao.findById(flightId);
		if (checkFlight.isPresent()) {
			return checkFlight.get();
		}

		else
			throw new RecordNotFoundException("Flight with Id: " + flightId + " not exists");

	}

	@Override
	public double getFare(int flightId, String classType) {
		// TODO Auto-generated method stub
		Flight flight = flightDao.findById(flightId).get();
		if (classType.equalsIgnoreCase("economy")) {
			return flight.getFare().getEconomyFare();
		}

		else if (classType.equalsIgnoreCase("premium")) {
			return flight.getFare().getPremiumFare();
		}

		else
			return flight.getFare().getBusinessFare();

	}

	@Override
	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return (List<Flight>) flightDao.findAll();
	}

}
