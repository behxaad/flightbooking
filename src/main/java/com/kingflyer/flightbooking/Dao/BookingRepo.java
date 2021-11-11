package com.kingflyer.flightbooking.Dao;

import com.kingflyer.flightbooking.entity.Booking;

public interface BookingRepo {

	Booking save(Booking user);

	Object findById(int book_id);

	void delete(Booking booking);

	Booking getOne(int book_id);

}
