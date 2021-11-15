package com.kingflyer.flightbooking.dao;

import org.springframework.data.repository.CrudRepository;

import com.kingflyer.flightbooking.entity.Contact;

public interface ContactDao extends CrudRepository<Contact, Integer> {
	
//	public boolean createContact(Contact contact);
//	public boolean modifyContact(Contact contact);
//	public boolean deleteContact(int contactId);
//	public Contact getContact(int contactId);
//	public List<Contact> getAllContact();

}
