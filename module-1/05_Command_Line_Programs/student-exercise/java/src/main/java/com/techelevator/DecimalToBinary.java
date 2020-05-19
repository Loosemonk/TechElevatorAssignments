package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		/****************Prompt to User run application****************/
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		
		
		String strBinaryToDecimal = input.nextLine(); 
		String[] strDecimalInputArray = strBinaryToDecimal.split(" ");
		int decimal = 0;
		int binary = 0;
	
		
		/**************** loop to calculate *************************/
		for ( int i =0; i < strDecimalInputArray.length; i++) {
			 decimal= Integer.parseInt(strDecimalInputArray[i]); 
			String outcomeBinary = Integer.toBinaryString(decimal);
			
			System.out.println(decimal +" in binary is " + outcomeBinary );
		}	
	}
		
}	
		
		
		
	
	
