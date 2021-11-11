package com.kingflyer.flightbooking.DAO;



import java.io.Serializable;

import javax.persistence.*;

import com.kingflyer.flightbooking.entity.Flight;

import java.util.List;


/**
 * The persistent class for the fleet_master database table.
 * 
 */
@Entity
@Table(name="fleet_master")
@NamedQuery(name="FleetMaster.findAll", query="SELECT f FROM FleetMaster f")
public class FleetDaoImp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FLEET_MASTER_ID")
	private int fleetMasterId;

	private String code;

	private String model;

	@Column(name="TOTAL_BUSINESS_SEATS")
	private int totalBusinessSeats;

	@Column(name="TOTAL_ECONOMY_SEATS")
	private int totalEconomySeats;

	@Column(name="TOTAL_PREMIUM_SEATS")
	private int totalPremiumSeats;

	//bi-directional many-to-one association to FlightMaster
	@OneToMany(mappedBy="fleetMaster")
	private List<Flight> flightMasters;

	public Fleet() {
	}

	public int getFleetMasterId() {
		return this.fleetMasterId;
	}

	public void setFleetMasterId(int fleetId) {
		this.fleetMasterId = fleetId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTotalBusinessSeats() {
		return this.totalBusinessSeats;
	}

	public void setTotalBusinessSeats(int totalBusinessSeats) {
		this.totalBusinessSeats = totalBusinessSeats;
	}

	public int getTotalEconomySeats() {
		return this.totalEconomySeats;
	}

	public void setTotalEconomySeats(int totalEconomySeats) {
		this.totalEconomySeats = totalEconomySeats;
	}

	public int getTotalPremiumSeats() {
		return this.totalPremiumSeats;
	}

	public void setTotalPremiumSeats(int totalPremiumSeats) {
		this.totalPremiumSeats = totalPremiumSeats;
	}

	public List<Flight> getFlightMasters() {
		return this.flightMasters;
	}

	public void setFlight(List<Flight> flight) {
		this.flightMasters = flight;
	}

	public Flight addFlight(Flight flight) {
		getFlightMasters().add(flight);
		flight.setFleet(this);

		return flight;
	}

	public Flight removeFlight(Flight flight) {
		getFlightMasters().remove(flight);
		flight.setFleet(null);

		return flight;
	}

}