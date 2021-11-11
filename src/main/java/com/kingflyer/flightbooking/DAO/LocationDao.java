package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Location;

public interface LocationDao{

	List<Location> findAll();

	void save(Location location);

	Object findById(int locid);

	void delete(Location location);

}
