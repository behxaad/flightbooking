package com.kingflyer.flightbooking.dao;

import java.util.List;

import com.kingflyer.flightbooking.entity.Contact;

public interface ContactDao {
	
	public boolean createContact(Contact contact);
	public boolean modifyContact(Contact contact);
	public boolean deleteContact(int contactId);
	public Contact getContact(int contactId);
	public List<Contact> getAllContact();

}
