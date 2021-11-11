package com.kingflyer.flightbooking.DAO;

import java.util.ArrayList;


import java.util.List;


@Repository
@Transactional
import com.kingflyer.flightbooking.Dao.FareDao;
import com.kingflyer.flightbooking.entity.Fare;

public class FareDaoimp implements FareDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public boolean newFare(Fare fare) {
		Session session = factory.getCurrentSession();
		try {
			session.save(fare);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	@Override
	public boolean modifyFare(Fare fare) {
		Session session = factory.getCurrentSession();
		try {
			session.update(fare);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

	@Override
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

	@Override
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

	@Override
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
