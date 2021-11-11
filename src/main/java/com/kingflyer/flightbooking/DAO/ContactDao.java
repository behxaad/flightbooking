package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Contact;

public interface ContactDao {
	public boolean modifyAddress(Contact addressDetail);
	public boolean addNewAddress(Contact addressDetail);
	public List<Contact> getAddressList(int personId);
	public boolean deleteAddress(int addressId);
}


