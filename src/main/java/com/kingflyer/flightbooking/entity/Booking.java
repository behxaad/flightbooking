package com.kingflyer.flightbooking.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private long bookingNumber;
	private Date bookingDate;
	private Date travelDate;
	private double totalCost;
	private int seatsBooked;
	private String seatClass;

	@ManyToOne
	private Flight flightBooked;

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

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingNumber=" + bookingNumber + ", totalCost=" + totalCost + "]";
	}

	public Flight getFlightBooked() {
		return flightBooked;
	}

	public void setFlightBooked(Flight flightBooked) {
		this.flightBooked = flightBooked;
	}
	
	
}
