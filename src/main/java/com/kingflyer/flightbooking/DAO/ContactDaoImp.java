package com.kingflyer.flightbooking.DAO;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kingflyer.flightbooking.entity.Contact;

@Repository
@Transactional
public class ContactDaoImp implements ContactDao {

	@Autowired
	private SessionFactory factory;

	public boolean modifyAddress(Contact addressDetail) {
		Session session = factory.getCurrentSession();
		try {
			
			session.update(addressDetail);
			
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	public boolean addNewAddress(Contact addressDetail) {
		Session session = factory.getCurrentSession();
		try {
			session.save(addressDetail);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	public List<Contact> getAddressList(int personId) {
		Session session = factory.getCurrentSession();
		List<Contact> addressDetailList = new ArrayList<Contact>();
		try {
			String query="from AddressDetail where person="+personId;
			addressDetailList = session.createQuery(query).list();
			return addressDetailList;
		} catch (RuntimeException e) {
			return addressDetailList;
		}
	}

	public boolean deleteAddress(int addressId) {
		Session session = factory.getCurrentSession();
		try {
			Query delete_query = session.createQuery("delete from AddressDetail where addressId=:id");
			delete_query.setParameter("id", addressId);
			int n = delete_query.executeUpdate();
			return true;
		} catch (RuntimeException e) {
			return false;
		}

	}

}
