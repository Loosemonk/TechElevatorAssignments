package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements ISellable {

	private BigDecimal price;
	
	public Cow() {
		super("Cow", "moo!");
	}

	
	@Override
	public BigDecimal getPrice() {
		return price;
	}
public void setPrice(int price) {
	this.price = new BigDecimal(price);
}
}