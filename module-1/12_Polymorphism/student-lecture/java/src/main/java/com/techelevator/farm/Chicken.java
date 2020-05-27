package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal implements ISellable {
	
	public Chicken() {
		super("Chicken", "cluck!");
	}
	
	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("15");
	}

}