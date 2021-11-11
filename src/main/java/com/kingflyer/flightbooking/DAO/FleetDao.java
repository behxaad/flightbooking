package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Fleet;

public interface FleetDao {

	public boolean createFleet(Fleet fleet);
	public boolean modifyFleet(Fleet fleet);
	public boolean deleteFleet(int fleetId);
	public Fleet getFleet(int fleetId);
	public List<Fleet> getAllFleet();
}
