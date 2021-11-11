package com.kingflyer.flightbooking.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kingflyer.flightbooking.entity.Fleet;

@Repository
@Transactional
public class FleetDaoImp implements FleetDao{
	@Autowired
	private SessionFactory factory;
	
	
	public boolean createFleet(Fleet fleet) {
		Session session = factory.getCurrentSession();
		try
		{
		session.save(fleet);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
		
	}

	
	public boolean modifyFleet(Fleet fleet) {
		Session session = factory.getCurrentSession();
		try
		{
		session.update(fleet);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}

	
	public boolean deleteFleet(int fleetId) {
		Session session = factory.getCurrentSession();
		try
		{
		Fleet fleetMaster = (Fleet) session.load(Fleet.class, fleetId);
		session.delete(fleetMaster);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}

	
	public FleetMaster getFleet(int fleetId) {
		Session session = factory.getCurrentSession();
		Fleet fleetMaster = new Fleet();
		try
		{
		fleetMaster = (Fleet)session.get(Fleet.class, fleetId);
		return fleetMaster;
		}
		catch(RuntimeException e)
		{
			return fleetMaster;
		}
	}

	
	public List<Fleet> getAllFleet() {
		Session session = factory.getCurrentSession();
		List<Fleet> fleetMasterList = new ArrayList<Fleet>();
		try
		{
		fleetMasterList = session.createQuery("from Fleet").list();
		return fleetMasterList;
		}
		catch(RuntimeException e)
		{
			return fleetMasterList;
		}

	}
}
