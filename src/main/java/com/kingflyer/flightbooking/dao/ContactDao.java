package com.kingflyer.flightbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.entity.Contact;
@Repository
public interface ContactDao extends CrudRepository<Contact, Integer> {
	

}
