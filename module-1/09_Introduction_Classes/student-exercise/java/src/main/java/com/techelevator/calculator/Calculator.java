package com.techelevator.calculator;

public class Calculator {

	//
	// Write code here
	//
	public Calculator() {
	}

	private int x;
	private int result;

	public int getResult() {
		return result;
	}

	public int add(int x) {
		result = result + x;
		return result;
	}

	public int multiply(int x) {
		result = result * x;
		return result;
	}

	public int power(int x) {
		 return result = (int)Math.pow(result, x);
	}
	public void reset() {
		result = 0;
	}

	public int subtract(int x) {
		result = result - x;
		return result;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}