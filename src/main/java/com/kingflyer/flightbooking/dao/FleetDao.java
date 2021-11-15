package com.kingflyer.flightbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kingflyer.flightbooking.entity.Fleet;


public interface FleetDao extends CrudRepository<Fleet, Integer>{

//	public boolean createFleet(Fleet fleetMaster);
//	public boolean modifyFleet(Fleet fleetMaster);
//	public boolean deleteFleet(int fleetId);
//	public Fleet getFleet(int fleetId);
//	public List<Fleet> getAllFleet();
}
