package com.kingflyer.flightbooking.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LocationMasterDAO;
import com.kingflyer.flightbooking.entity.Location;
import com.model.LocationMaster;

@Repository
@Transactional
public class LocationDaoImp implements LocationDao{

	@Autowired
	private SessionFactory factory;
	
	public boolean createLocation(Location location) {
		Session session = factory.getCurrentSession();
		try
		{
		session.save(location);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}

	
	public boolean updateLocation(Location location) {
		Session session = factory.getCurrentSession();
		try
		{
		session.save(location);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}	
	}

	
	public boolean deleteLocation(int locationId) {
		Session session = factory.getCurrentSession();
		try
		{	
		Query delete_query=session.createQuery("delete from LocationMaster where locationMasterId=:id");
		delete_query.setParameter("id", locationId);
		delete_query.executeUpdate();
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
}

	public Location getLocation(int locationId) {
		Session session = factory.getCurrentSession();
		Location locationMaster=new Location();
		try
		{
		locationMaster=(Location)session.get(Location.class, locationId);
		return locationMaster;
		}
		catch(RuntimeException e)
		{
			return locationMaster;
		}
	}

	
	public List<Location> getAllLocation() {
		Session session = factory.getCurrentSession();
		List<Location> locationMasters=new ArrayList<Location>();
		try
		{
			locationMasters=session.createQuery("from LocationMaster").list();
			return locationMasters;
		}
		catch(RuntimeException e)
		{
			return locationMasters;
		}
	}
}
