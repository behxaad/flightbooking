package com.operations;

import java.util.Date;

public class Fare {

	private int flightID;
	private String departureLocation;
	private String arrivalLocation;
	private Fleet fleet;
	private FlightStatus status;
	private Date departureTime;
	private Date arrivalTime;
	
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	public Fleet getFleet() {
		return fleet;
	}
	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}
	public FlightStatus getStatus() {
		return status;
	}
	public void setStatus(FlightStatus status) {
		this.status = status;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
}
