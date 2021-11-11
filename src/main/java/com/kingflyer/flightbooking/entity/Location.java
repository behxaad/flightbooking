package com.kingflyer.flightbooking.entity;


public class Location {


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	private int id;
	private String name;
	private String code;
	private String country;
	private String airportName;

	public Location(int id, String name, String code, String country, String airportName) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.country = country;
		this.airportName = airportName;
	}

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

}
