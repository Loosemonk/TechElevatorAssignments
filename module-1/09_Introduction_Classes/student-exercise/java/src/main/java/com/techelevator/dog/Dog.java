package com.techelevator.dog;

public class Dog {

	// private boolean isAwake;
	private boolean isSleeping;

	public Dog() {
	}

	public boolean isSleeping() {
		return isSleeping;
	}

	public String makeSound() {
		if (!isSleeping) {
			return "Woof!";
		} else {
			return "Zzzzz...";
		}

	}

	public void sleep() {
		isSleeping = true;
	}

	public void wakeUp() {
		isSleeping = false;
	}

}