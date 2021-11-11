package com.kingflyer.flightbooking.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

<<<<<<< HEAD
	public void setBookingNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setBookingId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setSeatClass(String classType) {
		// TODO Auto-generated method stub
		
	}

	public void setTravelDate(Object flightTravelDate) {
		// TODO Auto-generated method stub
		
	}

	public void setSeatsBooked(int seat) {
		// TODO Auto-generated method stub
		
	}

	public void setFlightMaster(Flight flightMaster) {
		// TODO Auto-generated method stub
		
	}

	public void setTotalCost(int total) {
		// TODO Auto-generated method stub
		
	}

=======
	@Id
	private int id;
	private long bookingNumber;
	private Date bookingDate;
	private Date travelDate;
	private double totalCost;
	private Flight flightBooked;

	public Booking(int id, long bookingNumber, Date bookingDate, Date travelDate, double totalCost,
			Flight flightBooked) {
		super();
		this.id = id;
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.totalCost = totalCost;
		this.flightBooked = flightBooked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Flight getFlightBooked() {
		return flightBooked;
	}

	public void setFlightBooked(Flight flightBooked) {
		this.flightBooked = flightBooked;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingNumber=" + bookingNumber + ", totalCost=" + totalCost + "]";
	}
>>>>>>> upstream/main
}
