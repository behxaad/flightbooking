package com.kingflyer.flightbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Fleet;

@Repository
public interface FleetDao extends CrudRepository<Fleet, Integer> {

//	public boolean createFleet(Fleet fleetMaster);
//	public boolean modifyFleet(Fleet fleetMaster);
//	public boolean deleteFleet(int fleetId);
//	public Fleet getFleet(int fleetId);
//	public List<Fleet> getAllFleet();
}
