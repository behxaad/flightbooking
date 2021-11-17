package com.kingflyer.flightbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Booking;

@Repository
public interface BookingDao extends CrudRepository<Booking, Integer>{

	@Query(value="SELECT * FROM BOOKING WHERE id=?1", nativeQuery=true)
	public Booking findByBookingId(int bookingId);

}
