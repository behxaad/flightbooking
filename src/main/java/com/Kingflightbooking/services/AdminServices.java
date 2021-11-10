/**
 * 
 */
package com.Kingflightbooking.services;

import java.util.List;

import com.operations.Fare;
import com.operations.Fleet;
import com.operations.Flight;
import com.operations.Location;



/**
 * @author rochitya
 *
 */
public interface AdminServices {

	public boolean addFlight(Flight flight);
	public boolean updateFlight(Flight flight);
	public boolean deleteFlight(Flight flight);
	
	
	public boolean addLocation(Location location);
	public boolean modifyLocation(Location location);
	public boolean deleteLocation(int locationId);
	public List<Location> getAllLocationDetail();
	
	public boolean addFleet(Fleet fleet);
	public boolean modifyFleet(Fleet fleet);
	public boolean deleteFleet(int fleetId);
	public List<Fleet> getAllFleetDetail();
	
	public boolean modifyFare(Fare fare);
	public List<Fare> getAllFareDetail(Fare fare);
	
}
