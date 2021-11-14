package com.kingflyer.flightbooking.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Booking;

@Repository
public class BookingDaoImpl implements BookingDao {

	@Override
	public boolean createBooking(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBooking(int bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Booking getBooking(int bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getBookedDetails(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
