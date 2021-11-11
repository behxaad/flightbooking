package com.kingflyer.flightbooking.entity;

public class Passenger {

<<<<<<< HEAD
	public void setPassengerId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setGender(String gender) {
		// TODO Auto-generated method stub
		
	}

	public void setMiddleName(String middleName) {
		// TODO Auto-generated method stub
		
	}

	public void setPassengerType(String passengerType) {
		// TODO Auto-generated method stub
		
	}

	public void setPassportNumber(String passportNumber) {
		// TODO Auto-generated method stub
		
	}

	public void setAge(int parseInt) {
		// TODO Auto-generated method stub
		
	}

	public void setMealPreferences(String mealPreferences) {
		// TODO Auto-generated method stub
		
	}

	public void setFirstName(String userName) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		
=======
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private String passportNo;
	private String mealPref;

	public Passenger(int id, String firstName, String lastName, int age, char gender, String passportNo,
			String mealPref) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.passportNo = passportNo;
		this.mealPref = mealPref;
	}

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
>>>>>>> upstream/main
	}

}
