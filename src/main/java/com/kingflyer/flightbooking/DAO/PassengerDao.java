package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Passenger;

public interface PassengerDao {
	public boolean newPassenger(Passenger passenger);
	public List<Passenger> getPassenger(int bookingId);

}
