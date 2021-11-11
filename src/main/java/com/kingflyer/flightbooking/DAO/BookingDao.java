package com.kingflyer.flightbooking.dao;

import com.kingflyer.flightbooking.entity.Booking;

public interface BookingDao{

	void delete(Booking booking);

	Object findById(int book_id);

	Booking save(Booking user);

	Booking getOne(int book_id);

}
