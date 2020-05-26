package com.techelevator.company;

public class Company {


	
	
	
	
	//public String  
		
	private int numberOfEmployees;
	private String name;
	private double revenue;
	private double expenses;
	public Company() {
	}
	
	public double getProfit() {
		return revenue - expenses; 
	}
	
	public void setProfit(double  revenue) {
		
	
			
		}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String  name) {
		this.name = name;
			
		}
	
	/*public Company(double revenue, double expenses) {
	setRevenue(revenue)=0;
	setExpenses(expenses)=0;
	
	}
	*/
	
	public double getRevenue() {
		return revenue; 
	}
	
	public void setRevenue(double  revenue) {
		if (revenue>0) {
			this.revenue = revenue;
			
		}
	}
		
	public int getNumberOfEmployees () {
		return numberOfEmployees;
}

public void setNumberOfEmployees (int numberOfEmployees) {
	this.numberOfEmployees = numberOfEmployees;
}
	
	public double getExpenses() {
		return expenses; 
	}
	
	public void setExpenses(double expenses) {
		if (expenses>0) {
			this.expenses = expenses;}
		}
	public String getCompanySize () {
		if (numberOfEmployees <= 50) {
			return "small";
		}else if(numberOfEmployees >= 51 && numberOfEmployees <= 250) {
			return "medium";
		}else  {
			return "large";
		}
	}
	
	
		
	
	}
	
	
	

	

	
	
	
	
	

