package com.kingflyer.flightbooking.DAO;

import java.util.List;

import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.User;


@Repository
@Transactional
public class BookingDaoImp implements BookingDao {

	
	@Autowired
	private SessionFactory factory;
	
	public boolean newBooking(Booking booking) {

		Session session = factory.getCurrentSession();
		try
		{
			session.save(booking);
			return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}

	@Override
	public List<Booking> getBookedDetails(int personId) {
      Session session=factory.getCurrentSession();
		
		try
		{
			List<Booking> bookingList;
			session.beginTransaction().commit();
			String sql_query="from Booking WHERE User="+userId;
			bookingList=session.createQuery(sql_query).list();
			return bookingList;
		}
		catch(RuntimeException e)
		{
			return null;
		}
	}

	@Override
	public boolean deleteBooking(int bookingId) {
		Session session = factory.getCurrentSession();
		try
		{
			Booking del = (Booking) session.load(Booking.class, bookingId);
			session.delete(del);
			return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}

	@Override
	public Booking getBooking(int bookingId) {
		Booking booking=new Booking();
		Session session = factory.getCurrentSession();
		try
		{
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.eq("flightId", bookingId));
			booking=(Booking)criteria.uniqueResult();
			return booking;
		}
		catch(RuntimeException e)
		{
			return booking;
		}
	}

}
