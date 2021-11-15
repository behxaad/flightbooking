package com.kingflyer.flightbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.dao.FareDao;
import com.kingflyer.flightbooking.dao.FleetDao;
import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.LocationDao;
import com.kingflyer.flightbooking.entity.Fare;
import com.kingflyer.flightbooking.entity.Fleet;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;
import com.kingflyer.flightbooking.exceptions.RecordAlreadyPresentException;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;

@Service
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

		Optional<Flight> checkFlight = flightDao.findById(flight.getId());
		if (!checkFlight.isPresent()) {
			flightDao.save(flight);
			return true;
		}

		else
			throw new RecordAlreadyPresentException("Flight with Id: " + flight.getId() + " already exists");

	}

	@Override
	public boolean deleteFlight(int flightId) {

		Optional<Flight> findById = flightDao.findById(flightId);
		if (findById.isPresent()) {
			flightDao.deleteById(flightId);
			return true;
		} else
			throw new RecordNotFoundException("Flight with Id: " + flightId + " not exists");

	}

	@Override
	public List<Flight> getAllFlights() {

		return (List<Flight>) flightDao.findAll();
	}

	@Override
	public boolean addFleet(Fleet fleet) {

		Optional<Flight> checkFleet = flightDao.findById(fleet.getId());
		if (!checkFleet.isPresent()) {
			fleetDao.save(fleet);
			return true;
		}

		else
			throw new RecordAlreadyPresentException("Fleet with Id: " + fleet.getId() + " already exists");
	}

	@Override
	public boolean modifyFleet(Fleet fleet) {

		fleetDao.save(fleet);
		return true;
	}

	@Override
	public boolean deleteFleet(int fleetId) {
		Optional<Fleet> checkFleet = fleetDao.findById(fleetId);

		if (checkFleet.isPresent()) {
			fleetDao.deleteById(fleetId);
			return true;

		}

		throw new RecordNotFoundException("Fleet with Id: " + fleetId + " not exists");

	}

	@Override
	public List<Fleet> getAllFleets() {

		return (List<Fleet>) fleetDao.findAll();
	}

	@Override
	public boolean addfare(Fare fare) {
		fareDao.save(fare);
		return true;
	}

	@Override
	public boolean modifyFare(Fare fare) {

		return fareDao.save(fare) != null;
	}

	@Override
	public List<Fare> getAllFares(Fare fare) {

		return (List<Fare>) fareDao.findAll();
	}

	@Override
	public boolean addLocation(Location location) {

		Optional<Location> checkLocation = locationDao.findById(location.getId());
		if (!checkLocation.isPresent()) {
			locationDao.save(location);
			return true;
		}

		else
			throw new RecordAlreadyPresentException("Location with Id: " + location.getId() + " already exists");
	}

	@Override
	public boolean modifyLocation(Location location) {

		return locationDao.save(location) != null;
	}

	@Override
	public boolean deleteLocation(int locationId) {
		Optional<Location> checkLocation = locationDao.findById(locationId);
		if (checkLocation.isPresent()) {
			fleetDao.deleteById(locationId);
			return true;
		}

		throw new RecordNotFoundException("Location with Id: " + locationId + " not exists");
	}

	@Override
	public List<Location> getAllLocations() {

		return (List<Location>) locationDao.findAll();
	}

}
