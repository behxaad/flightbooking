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

//	public boolean createFlight(Flight flight);
	@Query(value = "SELECT * FROM Flight WHERE departureLocation=?1 AND arrivalLocation=?2 AND travedDate=?3", nativeQuery = true)
	public List<Flight> searchFlight(Optional<Location> source, Optional<Location> destination, Date travelDate);

	@Query(value = "SELECT * FROM FLIGHT WHERE id=?1", nativeQuery = true)
	public Flight findByFlightId(int flightId);
//	public Flight getFlight(int flightId);
//	public boolean updateRemainingSeats(int flightId);
//	public List<Flight> getAllFlight();

}
