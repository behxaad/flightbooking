package com.kingflyer.flightbooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int locid;
	private String locname;
	private String loccode;
	private String loccountry;
	private String airport_name;
	public int getLocid() {
		return locid;
	}
	public void setLocid(int locid) {
		this.locid = locid;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	public String getLoccode() {
		return loccode;
	}
	public void setLoccode(String loccode) {
		this.loccode = loccode;
	}
	public String getLoccountry() {
		return loccountry;
	}
	public void setLoccountry(String loccountry) {
		this.loccountry = loccountry;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	@Override
	public String toString() {
		return "Location [locid=" + locid + ", locname=" + locname + ", loccode=" + loccode + ", loccountry="
				+ loccountry + ", airport_name=" + airport_name + "]";
	}
	
}
