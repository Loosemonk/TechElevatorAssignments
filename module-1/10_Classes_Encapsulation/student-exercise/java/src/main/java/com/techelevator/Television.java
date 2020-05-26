package com.techelevator;

public class Television {

	private boolean isOn;
	private int currentChannel;
	private int currentVolume;

	public Television() {
		currentVolume = 2;
		currentChannel = 3;
		isOn = false;
	}

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void turnOff() {
		isOn = !isOn;

	}

	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}

	public void changeChannel(int newChannel) {
		if (isOn) {
			if (currentChannel >= 3 && currentChannel <= 18) {
				currentChannel = newChannel;
			} else
				currentChannel = 3;
		}

	}

	public void channelUp() {
		if (isOn) {
			if (currentChannel < 18)
				currentChannel++;
			else
				currentChannel = 3;
		}
	}

	public void channelDown() {
		if (isOn) {
			if (currentChannel > 3)
				currentChannel--;
			else
				currentChannel = 18;
		}
	}

	public void raiseVolume() {
		if (isOn && currentVolume < 10) {
			currentVolume++;
		}

	}

	public void lowerVolume() {
		if (isOn && currentVolume > 0)
			currentVolume--;
	}
}