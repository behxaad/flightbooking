package com.kingflyer.flightbooking.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	private int flightId;

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

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flighId) {
		this.flightId = flighId;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingNumber=" + bookingNumber + ", bookingDate=" + bookingDate
				+ ", travelDate=" + travelDate + ", totalCost=" + totalCost + ", seatsBooked=" + seatsBooked
				+ ", seatClass=" + seatClass + ", flightId=" + flightId + "]";
	}

}
