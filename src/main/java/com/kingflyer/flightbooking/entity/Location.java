package com.kingflyer.flightbooking.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	private String code;
	private String country;
	private String airportName;
	@OneToMany(mappedBy = "departureLocation")
	private List<Flight> departure;
	@OneToMany(mappedBy = "arrivalLocation")
	private List<Flight> arrival;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public List<Flight> getDeparture() {
		return departure;
	}

	public void setDeparture(List<Flight> departure) {
		this.departure = departure;
	}

	public List<Flight> getArrival() {
		return arrival;
	}

	public void setArrival(List<Flight> arrival) {
		this.arrival = arrival;
	}

}
