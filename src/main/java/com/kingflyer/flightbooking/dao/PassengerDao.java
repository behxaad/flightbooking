package com.kingflyer.flightbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Passenger;

@Repository
public interface PassengerDao extends CrudRepository<Passenger, Integer> {

	@Query(value="SELECT * FROM PASSENGER WHERE BOOKING_NUMBER=?1",nativeQuery=true)
	public Passenger findByBookingNumber(int bookingNumber);

}
