package com.kingflyer.flightbooking.Dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Fleet;

public interface FleetDao {

	List<Fleet> findAll();

	Fleet save(Fleet fleet);

	Fleet getOne(int fleet);

	void delete(Fleet p);

}
