package com.kingflyer.flightbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.dao.BookingDao;
import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.PassengerDao;
import com.kingflyer.flightbooking.entity.Booking;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.Passenger;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;

@Service
public class BookingServiceImpl implements BookingService {

	private static String TICKETS_NOT_AVAILABLE = "Tickets Not Available";
	private static String SEATS_AVAILABLE = "Seats Available ";
	private static String SORRY = "Sorry ";

	@Autowired
	private BookingDao bookingDao;
	@Autowired
	private PassengerDao passengerDao;
	@Autowired
	private FlightDao flightDao;

	@Override
	public boolean bookTicket(Booking booking, List<Passenger> passengers) {
		Optional<Flight> checkFlight = flightDao.findById(booking.getFlightId());

		if (updateSeat(booking.getFlightId(), booking.getSeatsBooked(), booking.getSeatClass())
				&& checkFlight.isPresent()) {
			Booking newBooking = booking;
			List<Passenger> newPassenger = passengers;

			for (int i = 0; i < passengers.size(); i++) {
				passengerDao.save(newPassenger.get(i));
			}

			bookingDao.save(newBooking);

			return true;

		}
		throw new RecordNotFoundException(TICKETS_NOT_AVAILABLE);

	}

	@Override
	public boolean cancelTicket(int bookingId) {
		Optional<Booking> checkBooking = bookingDao.findById(bookingId);

		if (checkBooking.isPresent()) {
			Booking booking = bookingDao.findByBookingId(bookingId);
			Flight flight = flightDao.findFlightById(booking.getFlightId());
			Passenger passenger = passengerDao.findByBookingNumber((int) booking.getBookingNumber());
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
				passengerDao.deleteById(passenger.getId());
				bookingDao.deleteById(bookingId);
				return true;
			}

		}
		throw new RecordNotFoundException("Booking with Id: " + bookingId + " not exists");

	}

	@Override
	public String checkSeatAvailability(int flightId, int seatsRequired, String classType) {
		Optional<Flight> flight = flightDao.findById(flightId);
		if (flight.isPresent()) {
			if (classType.equalsIgnoreCase("economy")) {
				if (flight.get().getRemainingEconomySeats() >= seatsRequired) {
					return SEATS_AVAILABLE;
				} 
					return SORRY + flight.get().getRemainingEconomySeats() + " " + SEATS_AVAILABLE;
			} else if (classType.equalsIgnoreCase("business")) {
				if (flight.get().getRemainingBusinessSeats() >= seatsRequired) {
					return "Seats Available";
				} 
					return SORRY + flight.get().getRemainingBusinessSeats() + " " + SEATS_AVAILABLE;
			} else if (classType.equalsIgnoreCase("premium")) {
				if (flight.get().getRemainingPremiumSeats() >= seatsRequired) {
					return "Seats Available";
				} 
					return SORRY + flight.get().getRemainingPremiumSeats() + " " + SEATS_AVAILABLE;
			}
		}
		throw new RecordNotFoundException("No Record Found");

	}

	@Override
	public boolean updateSeat(int flightId, int seat, String classType) {
		Optional<Flight> checkFlight = flightDao.findById(flightId);
		if (checkFlight.isPresent()) {
			Flight flight = flightDao.findFlightById(flightId);
			if (classType.equalsIgnoreCase("economy")) {
				if (flight.getRemainingEconomySeats() >= seat) {
					flight.setRemainingEconomySeats(flight.getRemainingEconomySeats() - seat);
					return true;
				} 
					return false;
			}

			else if (classType.equalsIgnoreCase("premium")) {
				if (flight.getRemainingPremiumSeats() >= seat) {
					flight.setRemainingPremiumSeats(flight.getRemainingPremiumSeats() - seat);
					return true;
				} 
					return false;
			}

			else if (classType.equalsIgnoreCase("business")) {
				if (flight.getRemainingBusinessSeats() >= seat) {
					flight.setRemainingBusinessSeats(flight.getRemainingBusinessSeats() - seat);
					return true;
				} 
					return false;
			}

			flightDao.save(flight);
		}
		return false;
	}

}
