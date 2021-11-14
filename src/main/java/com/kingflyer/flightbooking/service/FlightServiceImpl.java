package com.kingflyer.flightbooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.LocationDao;
import com.kingflyer.flightbooking.entity.Flight;

public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightDao flightDao;
	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Flight> getSearchDetails(int sourceId, int destinationId, Date date, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlight(int flightId) {
		// TODO Auto-generated method stub
		return null;
	}

}
