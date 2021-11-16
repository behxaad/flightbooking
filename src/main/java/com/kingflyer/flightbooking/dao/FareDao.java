package com.kingflyer.flightbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Fare;
@Repository
public interface FareDao extends CrudRepository<Fare,Integer> {


}
