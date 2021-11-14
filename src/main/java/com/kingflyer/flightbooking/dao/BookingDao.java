package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Booking;

public interface BookingDao{

	public boolean createBooking(Booking booking);
	public boolean deleteBooking(int bookingId);
	public Booking getBooking(int bookingId);
	public List<Booking> getBookedDetails(int userId);

}
