package com.kingflyer.flightbooking.entity;

import java.util.List;

public class CreateBooking {

	public Booking booking;
	public List<Passenger> passengers;
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	@Override
	public String toString() {
		return "CreateBooking [booking=" + booking + ", passengers=" + passengers + "]";
	}
	
	
	
	
}
