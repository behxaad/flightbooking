package com.kingflyer.flightbooking.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kingflyer.flightbooking.dao.FlightDao;
import com.kingflyer.flightbooking.dao.UserDao;
import com.kingflyer.flightbooking.entity.Contact;
import com.kingflyer.flightbooking.entity.Flight;
import com.kingflyer.flightbooking.entity.User;
import com.kingflyer.flightbooking.service.FlightService;
import com.kingflyer.flightbooking.service.UserService;

@SpringBootTest
class FlightTests {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDao userDao;
	@Autowired
	private FlightService flightService;
	@Autowired
	private FlightDao flightDao;
	

	@Test
	public void addUser() {

		User user = new User();
		user.setId(3);
		user.setUserName("behxaad");
		user.setPassword("123abc");
		user.setFirstName("Behzad");
		user.setLastName("Bhat");
		user.setEmail("behzad@gmail.com");

		Contact contact = new Contact();
		contact.setId(3);
		contact.setType("mobile");
		contact.setAddressLine("Sgr");
		contact.setCity("Sgr");
		contact.setCountry("India");
		contact.setState("J&K");
		contact.setMobileNo(123456);
		contact.setZipCode(190003);
		user.setContact(contact);

		userDao.save(user);

		assertNotNull(userDao.findById(3).get());

	}

	private void assertNotNull(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
	 @Test
	 public void addFlight()
	 {
		 Flight flight = new Flight();
		 flight.setId(1);
		 flight.setArrivalLocation(null);
		 flight.setArrivalTime(null);
		 flight.setDepartureLocation(null);
	 }
	  
	
	
}
