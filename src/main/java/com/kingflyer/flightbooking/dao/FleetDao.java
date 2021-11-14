package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Fleet;


public interface FleetDao{

	public boolean createFleet(Fleet fleetMaster);
	public boolean modifyFleet(Fleet fleetMaster);
	public boolean deleteFleet(int fleetId);
	public Fleet getFleet(int fleetId);
	public List<Fleet> getAllFleet();
}
