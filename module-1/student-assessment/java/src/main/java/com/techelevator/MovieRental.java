package com.techelevator;

import java.math.BigDecimal;

public class MovieRental {
	private String title;
	private String format;
	private boolean isPremium = true;
	private Double rentalPrice;
	private int daysLate;
	
	public MovieRental(String title, String format, boolean isPremium) {
	this.setTitle(title);
	this.setFormat(format);
	this.setPremium(isPremium);
	
}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	public Double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(Double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
public double isLate() {
	if (daysLate == 0) {
				return 0.00;
	}else if(daysLate == 1) {
		return 1.99;
	}else if (daysLate == 2) {
		return 3.99;
	}else if (daysLate >=3){
		return 19.99;
	}return daysLate;
}
public double rentalCost() {
	double cost = 0;
	if (isPremium) {
		cost = cost + 1;
	
	if (getFormat() == "VHS"){
			cost = 0.99;
	}else if (getFormat() == "DVD"){
			cost = 1.99;
	}else if (getFormat() == "BluRay"){
			cost = 2.99;
	}
	}return cost;
}
public String toString() {
	String result = "Movie " + " - " + getTitle() + " - " + getFormat() + " " + getRentalPrice(); 
	return result;
}


}
