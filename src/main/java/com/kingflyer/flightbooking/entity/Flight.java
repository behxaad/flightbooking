package com.kingflyer.flightbooking.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Flight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	@ManyToOne(targetEntity = Location.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "departureId", referencedColumnName = "id")
	private Location departureLocation;
	@ManyToOne(targetEntity = Location.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "arrivalId", referencedColumnName = "id")
	private Location arrivalLocation;
	@OneToOne(targetEntity = Fleet.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fleetId", referencedColumnName = "id")
	private Fleet fleet;
	private int remainingEconomySeats;
	private int remainingPremiumSeats;
	private int remainingBusinessSeats;
	private Date departureTime;
	private Date arrivalTime;
	@Temporal(TemporalType.DATE)
	private Date travelDate;
	@OneToOne(targetEntity = Fare.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fareId", referencedColumnName = "id")
	private Fare fare;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Location getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(Location departureLocation) {
		this.departureLocation = departureLocation;
	}

	public Location getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(Location arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public Fleet getFleet() {
		return fleet;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	public int getRemainingEconomySeats() {
		return remainingEconomySeats;
	}

	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}

	public int getRemainingPremiumSeats() {
		return remainingPremiumSeats;
	}

	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}

	public int getRemainingBusinessSeats() {
		return remainingBusinessSeats;
	}

	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
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

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Fare getFare() {
		return fare;
	}

	public void setFare(Fare fare) {
		this.fare = fare;
	}

}
