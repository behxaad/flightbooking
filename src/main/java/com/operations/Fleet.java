package com.operations;

public class Fleet {
	
	private int fleetId;
	private String fleetCode;
	private String fleetModel;
	private int totalEconomySeats;
	private int totalPremiumSeats;
	private int totalBusinessSeats;
	
	
	public Fleet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFleetId() {
		return fleetId;
	}
	public void setFleetId(int fleetId) {
		this.fleetId = fleetId;
	}
	public String getFleetCode() {
		return fleetCode;
	}
	public void setFleetCode(String fleetCode) {
		this.fleetCode = fleetCode;
	}
	public String getFleetModel() {
		return fleetModel;
	}
	public void setFleetModel(String fleetModel) {
		this.fleetModel = fleetModel;
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
