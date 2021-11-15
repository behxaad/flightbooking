package com.kingflyer.flightbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.kingflyer.flightbooking.entity.Booking;

public interface BookingDao extends CrudRepository<Booking, Integer>{

	@Query(value="SELECT * FROM BOOKING WHERE id=bookingId", nativeQuery=true)
	public Booking findByBookingId(int bookingId);
//	public boolean createBooking(Booking booking);
//	public boolean deleteBooking(int bookingId);
//	public Booking getBooking(int bookingId);
//	public List<Booking> getBookedDetails(int userId);

}
