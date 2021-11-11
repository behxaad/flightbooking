package com.kingflyer.flightbooking.Dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Location;

public interface LocationDao {

	Object findById(int locid);

	void save(Location location);

	List<Location> findAll();

	void delete(Location location);

}
