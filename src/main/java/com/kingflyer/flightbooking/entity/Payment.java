package com.kingflyer.flightbooking.entity;

import javax.persistence.Id;

public class Payment {

	@Id
	private int id;
	private double amount;

	public Payment(int id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
