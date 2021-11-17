package com.kingflyer.flightbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Fleet;

@Repository
public interface FleetDao extends CrudRepository<Fleet, Integer> {

}
