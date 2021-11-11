package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Fare;

public interface FareDao {
	public boolean newFare(Fare fareMaster);
	public boolean modifyFare(Fare fareMaster);
	public boolean deleteFare(int fareId);
	public Fare getFare(int fareMasterId);
	public List<Fare> getAllFareList();

}
