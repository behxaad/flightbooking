package com.kingflyer.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kingflyer.flightbooking.dao.BookingDao;
import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.PassengerDao;
import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.Passenger;

public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingDao bookingDao;
	@Autowired
	private PassengerDao passengerDao;
	@Autowired
	private FlightDao flightDao;

	@Override
	public boolean bookTicket(Booking booking, List<Passenger> passengers) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelTicket(int bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkSeatAvailability(int flightId, int seatsRequired, String classType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSeat(int flightMasterId, int seat, String classType) {
		// TODO Auto-generated method stub
		return false;
	}

}
