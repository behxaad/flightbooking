package com.kingflyer.flightbooking.DAO;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kingflyer.flightbooking.entity.User;


@Repository
@Transactional
public class UserDaoImp implements UserDao  {

	@Autowired
	private SessionFactory factory;

	public boolean addUser(User user) {
		Session session = factory.getCurrentSession();
		try {
			System.out.println("dwasfwfd");
			session.save(user);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	public boolean modifyUserDetails(User user) {
		Session session = factory.getCurrentSession();
		try {
			session.update(person);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	public User getUser(String emailAddress) {
		Session session = factory.getCurrentSession();
		System.out.println(session.hashCode());
		User user = new User();
		try {
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.eq("emailAddress", emailAddress));
			user = (User) criteria.uniqueResult();
			System.out.println("entered");
			return user;
		} catch (RuntimeException e) {
			return user;
		}
	}

	public boolean deleteUser(String emailAddress) {
		Session session = factory.getCurrentSession();
		try {

			Query delete_query = session
					.createQuery("delete from Person where emailAddress=:id");
			delete_query.setParameter("id", emailAddress);
			delete_query.executeUpdate();

			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}
}
