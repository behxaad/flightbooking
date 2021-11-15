package com.kingflyer.flightbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Passenger;

@Repository
public interface PassengerDao extends CrudRepository<Passenger, Integer> {
	

}
