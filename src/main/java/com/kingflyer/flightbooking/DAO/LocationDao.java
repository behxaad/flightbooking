package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Location;

public interface LocationDao {
	public boolean createLocation(Location location);
	public boolean updateLocation(Location locationMaster);
	public boolean deleteLocation(int locationId);
	public Location getLocation(int locationMasterId);
	public List<Location> getAllLocation();

}
