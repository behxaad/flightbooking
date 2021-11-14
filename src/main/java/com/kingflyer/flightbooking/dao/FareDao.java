package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Fare;

public interface FareDao {

	public boolean createFare(Fare fare);
	public boolean deleteFare(int fareId);
	public boolean modifyFare(Fare fare);
	public Fare getFare(int fareId);
	public List<Fare> getAllFare();

}
