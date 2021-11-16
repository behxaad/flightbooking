package com.kingflyer.flightbooking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private double economyFare;
	private double premiumFare;
	private double businessFare;

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
