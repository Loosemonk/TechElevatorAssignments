package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	
		 
		
		
		/**************** start of application/Prompt for length **************************/	
		System.out.println("Please enter the length");
		String strLength = input.nextLine();
		int unconvertedLength = Integer.parseInt(strLength);
		
		
		/******************Prompt for length Version**********************/
		 
		System.out.println("Is the measurement in (f)eet or (m)eters?");
		String oldTemp = input.nextLine();
		/************************Variables and Conversions*********************/
		
		if (oldTemp.equals("f")) {
		     double convertLengthToMeters = (int)(unconvertedLength* 0.3048);
			 System.out.println( unconvertedLength + " f" + " is " + convertLengthToMeters + " m" );
		} else if (oldTemp.equals("m")) {
			
			double convertLengthToFeet = (int)(unconvertedLength * 3.2808399);
			 System.out.println( unconvertedLength + " m" +  " is " +  convertLengthToFeet + " f" );
			
		} else   
			 System.out.println("Please rerun and enter 'f' or 'm'");
		
		}
		
		
		
	
	
	
	
	
	
	}


