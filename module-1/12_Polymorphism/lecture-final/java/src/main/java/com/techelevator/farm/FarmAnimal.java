package com.techelevator.farm;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public String getName( ) {
		return name;
	}
	public final String getSound( ) {
		if (isAsleep) {
			return "Zzzzz";
		}
		return sound;
	}

	public boolean isAsleep() {
		return isAsleep;
	}
	public void goToSleep() {
		isAsleep = true;
	}
	public void wakeUp() {
		isAsleep = false;
	}



}