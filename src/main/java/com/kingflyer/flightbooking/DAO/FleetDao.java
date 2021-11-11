package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Fare;
import com.kingflyer.flightbooking.entity.Fleet;
import com.kingflyer.flightbooking.entity.Flight;

public interface FleetDao{

	List<Fleet> findAll();

	Fleet save(Fleet fleet);

	void delete(Fleet p);

	Fleet getOne(int flightId);

	

}
