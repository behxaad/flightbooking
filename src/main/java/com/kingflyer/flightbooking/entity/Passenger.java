package com.kingflyer.flightbooking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Passenger implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private String passportNo;
	private String mealPref;
	private int bookingNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getMealPref() {
		return mealPref;
	}

	public void setMealPref(String mealPref) {
		this.mealPref = mealPref;
	}
	
	

	public int getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(int bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", passportNo=" + passportNo + ", mealPref=" + mealPref + ", bookingNumber="
				+ bookingNumber + "]";
	}

}
