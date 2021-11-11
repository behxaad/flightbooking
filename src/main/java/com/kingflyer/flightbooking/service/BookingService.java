/**
 * 
 */
package com.kingflyer.flightbooking.service;

import java.util.List;

import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.Passenger;

/**
 * @author pudaykir
 *
 */
public interface BookingService {

	boolean bookTicket(Booking booking, List<Passenger> passengers);

}
