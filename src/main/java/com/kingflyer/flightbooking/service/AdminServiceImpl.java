package com.kingflyer.flightbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.exceptions.RecordAlreadyPresentException;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;

@Service
public class AdminServiceImpl implements AdminService {
	
	private static String FLIGHT_NOT_FOUND_WITH_ID="Flight with Id: ";

	@Autowired
	private FlightDao flightDao;

	@Override
	public boolean addFlight(Flight flight) {

		Optional<Flight> checkFlight = flightDao.findById(flight.getId());
		if (!checkFlight.isPresent()) {
			flightDao.save(flight);
			return true;
		}

		else
			throw new RecordAlreadyPresentException(FLIGHT_NOT_FOUND_WITH_ID+ flight.getId() + " already exists");

	}

	@Override
	public boolean deleteFlight(int flightId) {

		Optional<Flight> findById = flightDao.findById(flightId);
		if (findById.isPresent()) {
			flightDao.deleteById(flightId);
			return true;
		} else
			throw new RecordNotFoundException(FLIGHT_NOT_FOUND_WITH_ID + flightId + " not exists");

	}

	@Override
	public List<Flight> getAllFlights() {

		return (List<Flight>) flightDao.findAll();
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		Optional<Flight> checkFlight = flightDao.findById(flight.getId());
		if (checkFlight.isPresent()) {
			flightDao.save(flight);
			
		} else
			throw new RecordNotFoundException(FLIGHT_NOT_FOUND_WITH_ID + flight.getId() + " not exists!!");
		return flight;
	}

}
