package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		/************* Initialize Scanner *************/
		Scanner input = new Scanner(System.in);
		 
		
		
		/**************** start of application/Prompt for temp **************************/	
		System.out.println("Please enter the length");
		String strTemp = input.nextLine();
		int unconvertedTemp = Integer.parseInt(strTemp);
		
		/******************Prompt for Temp Version**********************/
		 
		System.out.println("Is your temperature in (C)elsius or (F)ahrenheit?");
		String oldTemp = input.nextLine();
		if (oldTemp.equals("F")) {

			 double convertTempToC = unconvertedTemp * 1.8 + 32;
			 System.out.println((int)unconvertedTemp + " F" + " is " + (int)convertTempToC + " C" );
		} else if (oldTemp.equals("C")) {
			
			double convertTempToF = (unconvertedTemp - 32) / 1.8;
			 System.out.println((int)unconvertedTemp + " C" + " is " + (int)convertTempToF + " F" );
			
		} else { 
			System.out.println("Please rerun and enter 'C' or 'F'");
		
		}
		
		
		
		
		
		
		
		
		
	}
		
}	
		
		
		

