package com.kingflyer.flightbooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fare {

	@Id
	private int id;
	private double economyFare;
	private double premiumFare;
	private double businessFare;

	public Fare(int id, double economyFare, double premiumFare, double businessFare) {
		super();
		this.id = id;
		this.economyFare = economyFare;
		this.premiumFare = premiumFare;
		this.businessFare = businessFare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getEconomyFare() {
		return economyFare;
	}

	public void setEconomyFare(double economyFare) {
		this.economyFare = economyFare;
	}

	public double getPremiumFare() {
		return premiumFare;
	}

	public void setPremiumFare(double premiumFare) {
		this.premiumFare = premiumFare;
	}

	public double getBusinessFare() {
		return businessFare;
	}

	public void setBusinessFare(double businessFare) {
		this.businessFare = businessFare;
	}

}
