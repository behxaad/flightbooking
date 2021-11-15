package com.kingflyer.flightbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kingflyer.flightbooking.entity.Fare;

public interface FareDao extends CrudRepository<Fare,Integer> {

//	public boolean createFare(Fare fare);
//	public boolean deleteFare(int fareId);
//	public boolean modifyFare(Fare fare);
//	public Fare getFare(int fareId);
//	public List<Fare> getAllFare();

}
