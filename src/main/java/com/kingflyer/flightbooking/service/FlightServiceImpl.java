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
	
	private static String FLIGHT_NOT_FOUND_WITH_ID="Flight with Id: ";

	@Autowired
	private FlightDao flightDao;
	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Flight> getSearchDetails(int sourceId, int destinationId, Date date) {

		if (locationDao.findById(sourceId).isPresent() && locationDao.findById(destinationId).isPresent()) {
			Optional<Location> departure = locationDao.findById(sourceId);
			Optional<Location> arrival = locationDao.findById(destinationId);
			return flightDao.searchFlight(departure, arrival, date);
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
			throw new RecordNotFoundException(FLIGHT_NOT_FOUND_WITH_ID + flightId + " not exists");

	}

	@Override
	public double getFare(int flightId, String classType) {

		Optional<Flight> flight = flightDao.findById(flightId);
		
		if(flight.isPresent())
		{
		if (classType.equalsIgnoreCase("economy")) {
			return flight.get().getFare().getEconomyFare();
		}

		else if (classType.equalsIgnoreCase("premium")) {
			return flight.get().getFare().getPremiumFare();
		}

		else if(classType.equalsIgnoreCase("business"))
			return flight.get().getFare().getBusinessFare();
		else
			throw new RecordNotFoundException("Invalid ClassType Entered");
		}
		
		else
			throw new RecordNotFoundException(FLIGHT_NOT_FOUND_WITH_ID + flightId + " not exists");
		

	}

	@Override
	public List<Flight> getAllFlights() {

		return (List<Flight>) flightDao.findAll();
	}

}
