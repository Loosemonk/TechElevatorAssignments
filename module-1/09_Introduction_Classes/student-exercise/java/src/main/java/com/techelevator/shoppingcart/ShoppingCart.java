package com.techelevator.shoppingcart;

//import java.text.DecimalFormat;

public class ShoppingCart {

	//
	// Write code here
	//
	private int totalNumberOfItems;
	private double totalAmountOwed;

	public ShoppingCart() {
	}

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}

	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public double getAveragePricePerItem() {
		if (totalAmountOwed == 0 && totalNumberOfItems == 0)
			return 0;
		return totalAmountOwed / totalNumberOfItems;
	}

	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = numberOfItems + totalNumberOfItems;
		totalAmountOwed = pricePerItem * numberOfItems;
	}

	public void empty() {
		totalAmountOwed = 0;
		totalNumberOfItems = 0;
	}

}
