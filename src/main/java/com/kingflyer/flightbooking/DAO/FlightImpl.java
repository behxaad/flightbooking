package com.kingflyer.flightbooking.DAO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.FlightMasterDAO;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Location;
import com.model.FlightMaster;
import com.model.LocationMaster;
import com.model.Person;
@Repository
@Transactional
public class FlightImpl implements FlightDao {
	@Autowired
	private SessionFactory factory;
	
	public boolean newFlight(Flight flight) {
		Session session = factory.getCurrentSession();
		try
		{
		session.save(flight);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}

	
	public List<FlightMaster> searchFlight(Location sourceLocation, Location destinationLocation, Date travelDate) {

		Session session = factory.getCurrentSession();
		List<Flight> flightMaster=new ArrayList<Flight>();
		try
		{
		Criteria c=session.createCriteria(Flight.class);
		c.add(Restrictions.eq("locationMaster1", sourceLocation));
		c.add(Restrictions.eq("locationMaster2",destinationLocation));
		c.add(Restrictions.eq("flightTravelDate", travelDate));
		c.addOrder(Order.asc("departureTime"));
		flightMaster=c.list();
		return flightMaster;
		}
		catch(RuntimeException e)
		{
			return  flightMaster;
		}
	}
	
	
	public boolean updateRemainingSeats(Flight flightMaster) {
		Session session = factory.getCurrentSession();
		try
		{
		session.update(flightMaster);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}
	
	public Flight getFlight(int flightId) {
		Session session = factory.getCurrentSession();
		Flight flight=new Flight();
		try
		{
			Criteria criteria = session.createCriteria(Flight.class);
			criteria.add(Restrictions.eq("flightId", flightId));
			flight=(Flight)criteria.uniqueResult();
			return flight;
		}
		catch(RuntimeException e)
		{
			return flight;
		}
	}


	public List<Flight> getAll()
	{

		Session session = factory.getCurrentSession();
		List<Flight> list=session.createQuery("from FlightMaster").list();
		return list;
	}
}
