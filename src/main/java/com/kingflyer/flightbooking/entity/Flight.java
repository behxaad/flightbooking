package com.kingflyer.flightbooking.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	private int id;
	private String departureLocation;
	private String arrivalLocation;
	private Fleet fleet;
	private FlightStatus status;
	private Date departureTime;
	private Date arrivalTime;

	public Flight(int id, String departureLocation, String arrivalLocation, Fleet fleet, FlightStatus status,
			Date departureTime, Date arrivalTime) {
		super();
		this.id = id;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.fleet = fleet;
		this.status = status;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
