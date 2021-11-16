package com.kingflyer.flightbooking.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;

@Repository
public interface FlightDao extends CrudRepository<Flight, Integer> {

	@Query(value = "SELECT * FROM Flight f WHERE f.departure_Id=?1 AND f.arrival_Id=?2 AND f.travel_Date=?3", nativeQuery = true)
	public List<Flight> searchFlight(Optional<Location> departure, Optional<Location> arrival, Date date);

	@Query(value = "SELECT * FROM FLIGHT WHERE id=?1", nativeQuery = true)
	public Flight findByFlightId(int flightId);

}
