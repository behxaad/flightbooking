package com.kingflyer.flightbooking.entity;

public class Fleet {

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fleet {

	@Id
	private int id;
	private String code;
	private String model;
	private int totalEconomySeats;
	private int totalPremiumSeats;
	private int totalBusinessSeats;

	public Fleet(int id, String code, String model, int totalEconomySeats, int totalPremiumSeats,
			int totalBusinessSeats) {
		super();
		this.id = id;
		this.code = code;
		this.model = model;
		this.totalEconomySeats = totalEconomySeats;
		this.totalPremiumSeats = totalPremiumSeats;
		this.totalBusinessSeats = totalBusinessSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTotalEconomySeats() {
		return totalEconomySeats;
	}

	public void setTotalEconomySeats(int totalEconomySeats) {
		this.totalEconomySeats = totalEconomySeats;
	}

	public int getTotalPremiumSeats() {
		return totalPremiumSeats;
	}

	public void setTotalPremiumSeats(int totalPremiumSeats) {
		this.totalPremiumSeats = totalPremiumSeats;
	}

	public int getTotalBusinessSeats() {
		return totalBusinessSeats;
	}

	public void setTotalBusinessSeats(int totalBusinessSeats) {
		this.totalBusinessSeats = totalBusinessSeats;
	}

}
