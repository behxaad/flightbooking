/**
 * 
 */
package com.Kingflightbooking.services;

import java.util.Date;
import java.util.List;

import com.operations.Flight;

/**
 * @author rochitya
 *
 */
public interface FlightService {
	
	public List<Flight> getSearchDetails(String sourcePlace, String destinationPlace,Date date , int seatsRequired, String classType)


}
