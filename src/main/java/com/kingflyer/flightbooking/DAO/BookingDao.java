package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Booking;

public interface BookingDao {
	public boolean newBooking(Booking booking);
	public List<Booking> getBookedDetails(int personId);
	public boolean deleteBooking(int bookingId);
	public Booking getBooking(int bookingId);


}
