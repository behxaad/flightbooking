package com.kingflyer.flightbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kingflyer.flightbooking.entity.Location;

public interface LocationDao extends CrudRepository<Location, Integer>{

//public boolean createLocation(Location location);
//public boolean modifyLocation(Location location);
//public boolean deleteLocation(int locationId);
//public Location getLocation(int locationId);
//public List<Location> getAllLocation();

}
