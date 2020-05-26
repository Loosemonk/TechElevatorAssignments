package com.techelevator.person;

public class Person {

	//
	// Write code here
	//
	private String firstName; 
	private String lastName;
	private int age;
	
	public Person() {}
	
	
	
	public String getFirstName() {
		return  firstName;
	}
	
	public void setFirstName(String  firstName) {
		this.firstName = firstName;
			
		}
	
	
	public String getLastName() {
		return  lastName;
	}
	
	public void setLastName(String  lastName) {
		this.lastName = lastName;
			
		}
	
	public int getAge() {
		return age; 
	}
	
	public void setAge(int  age) {
		if (age>0) {
			this.age = age;
		}
		}
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public boolean isAdult() {
		if (age >= 18) 
			return true;
		else return false;
		
	}
	
	
			
	
}
