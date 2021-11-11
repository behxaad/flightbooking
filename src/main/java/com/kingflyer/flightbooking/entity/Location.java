package com.kingflyer.flightbooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

<<<<<<< HEAD
	public int getLocationMasterId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getAirportName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCountry(String country) {
		// TODO Auto-generated method stub
		
	}

	public void setAirportName(String airportName) {
		// TODO Auto-generated method stub
		
	}

	public void setCode(String code) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String city_name) {
		// TODO Auto-generated method stub
		
	}

	public void setLocationId(int i) {
		// TODO Auto-generated method stub
		
=======
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

	public Location() {
		// TODO Auto-generated constructor stub
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
>>>>>>> upstream/main
	}

}
