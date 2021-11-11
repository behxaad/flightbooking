package com.kingflyer.flightbooking.DAO;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kingflyer.flightbooking.entity.Fare;


@Repository
@Transactional
public class FareDaoImp implements FareDao {

	@Autowired
	private SessionFactory factory;

	
	public boolean newFare(Fare fareMaster) {
		Session session = factory.getCurrentSession();
		try {
			session.save(fareMaster);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	
	public boolean modifyFare(Fare fareMaster) {
		Session session = factory.getCurrentSession();
		try {
			session.update(fareMaster);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	
	public boolean deleteFare(int fareId) {
		Session session = factory.getCurrentSession();
		try {
			Fare fareMasterDelete = (Fare) session.load(Fare.class, fareId);
			session.delete(fareMasterDelete);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	
	public Fare getFare(int fareMasterId) {
		Session session = factory.getCurrentSession();
		Fare fareMaster = new Fare();
		try {
			fareMaster = (Fare) session.get(Fare.class, fareMasterId);
			return fareMaster;
		} catch (RuntimeException e) {
			return fareMaster;
		}
	}

	
	public List<Fare> getAllFareList() {
		Session session = factory.getCurrentSession();
		List<Fare> fareMasterList = new ArrayList<Fare>();
		try {
			fareMasterList = session.createQuery("from FareMaster").list();
			return fareMasterList;
		} catch (RuntimeException e) {
			return fareMasterList;
		}
	}

}