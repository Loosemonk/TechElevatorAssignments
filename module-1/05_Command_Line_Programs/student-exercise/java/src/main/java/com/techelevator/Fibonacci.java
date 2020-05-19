package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/****************Prompt user to run application****************/
		System.out.println("Enter number to see the Fibonacci sequence that preceeds it.");
		String userNumber = input.nextLine();
		/**************Variables needed to run application*****************/
		int numAfterSequence = Integer.parseInt(userNumber);
		int num1 = 0;
		int num2 = 1;	
		
		
		
		
		/******************Loop to compute and display Fibonacci sequence**************/
		for( int i = 0 ; i < numAfterSequence; ++i) {
			System.out.print(num1 + " " );
			int priorSum = num1 + num2;
			num1 = num2;
			num2 = priorSum;
			 i = num1;	
		}
	    }
     }

