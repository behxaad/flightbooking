package com.kingflyer.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kingflyer.flightbooking.dao.BookingDao;
import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.PassengerDao;
import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Passenger;

public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingDao bookingDao;
	@Autowired
	private PassengerDao passengerDao;
	@Autowired
	private FlightDao flightDao;

	@Override
	public boolean bookTicket(Booking booking, List<Passenger> passengers) {

		if (updateSeat(booking.getFlightBooked().getId(), booking.getSeatsBooked(), booking.getSeatClass())) {
			for (Passenger p : passengers)
				if (passengerDao.save(p) != null) {
					return true;
				} else
					return false;
			if (bookingDao.save(booking) != null) {
				return true;
			} else
				return false;
		}
		return false;

	}

	@Override
	public boolean cancelTicket(int bookingId) {
		Booking booking = bookingDao.findByBookingId(bookingId);
		Flight flight = flightDao.findByFlightId(booking.getFlightBooked().getId());
		if (booking != null) {
			if (flight != null) {
				String classType = booking.getSeatClass();
				int seats = booking.getSeatsBooked();
				if (classType.equalsIgnoreCase("Economy"))
					flight.setRemainingEconomySeats(flight.getRemainingEconomySeats() + seats);
				if (classType.equalsIgnoreCase("Business"))
					flight.setRemainingBusinessSeats(flight.getRemainingBusinessSeats() + seats);
				if (classType.equalsIgnoreCase("Premium"))
					flight.setRemainingPremiumSeats(flight.getRemainingPremiumSeats() + seats);

				flightDao.save(flight);
			}
			bookingDao.deleteById(bookingId);
			return true;
		}
		return false;

	}

	@Override
	public boolean checkSeatAvailability(int flightId, int seatsRequired, String classType) {
		Flight flight = flightDao.findByFlightId(flightId);
		if (flight != null) {
			if (classType.equals("economy")) {
				if (flight.getRemainingEconomySeats() < seatsRequired) {
					return true;
				} else
					return false;
			}
			if (classType.equals("business")) {
				if (flight.getRemainingBusinessSeats() < seatsRequired) {
					return true;
				} else
					return false;
			}
			if (classType.equals("premium")) {
				if (flight.getRemainingPremiumSeats() < seatsRequired) {
					return true;
				} else
					return false;
			}
		}
		return false;

	}

	@Override
	public boolean updateSeat(int flightId, int seat, String classType) {
		Flight checkFlight = flightDao.findByFlightId(flightId);
		if (checkFlight != null) {
			if (classType.equalsIgnoreCase("economy")) {
				checkFlight.setRemainingEconomySeats(checkFlight.getRemainingEconomySeats() - seat);
			}

			else if (classType.equalsIgnoreCase("premium")) {
				checkFlight.setRemainingPremiumSeats(checkFlight.getRemainingPremiumSeats() - seat);
			}

			else if (classType.equalsIgnoreCase("business")) {
				checkFlight.setRemainingBusinessSeats(checkFlight.getRemainingBusinessSeats() - seat);
			}

			flightDao.save(checkFlight);
		}
		return false;
	}

}
