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

		if (locationDao.findById(sourceId).isPresent() && locationDao.findById(destinationId).isPresent()) {
			Optional<Location> departure = locationDao.findById(sourceId);
			Optional<Location> arrival = locationDao.findById(destinationId);
			List<Flight> flights = flightDao.searchFlight(departure, arrival, date);
			return flights;
		}

		else
			throw new RecordNotFoundException("No Record Found");

	}

	@Override
	public Flight getFlight(int flightId) {

		Optional<Flight> checkFlight = flightDao.findById(flightId);
		if (checkFlight.isPresent()) {
			return checkFlight.get();
		}

		else
			throw new RecordNotFoundException("Flight with Id: " + flightId + " not exists");

	}

	@Override
	public double getFare(int flightId, String classType) {

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
	public List<Flight> getAllFlights() {

		System.out.println("flightDao.findAll()");
		return (List<Flight>) flightDao.findAll();
	}

}
