package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		File fizzBuzz = new File("FizzBuzz.txt");
		String strFizz = "";
		try (PrintWriter writer = new PrintWriter(fizzBuzz)) {
			for (int i = 0; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					strFizz = "FizzBuzz";
				} else if (i % 3 == 0) {
					strFizz = "Fizz";
				} else if (i % 5 == 0) {
					strFizz = "Buzz";
				} else if ((Integer.toString(i).contains("3")) && (Integer.toString(i).contains("5"))) {
					strFizz = "FizzBuzz";
				} else if (Integer.toString(i).contains("3")) {
					strFizz = "Fizz";
				} else if (Integer.toString(i).contains("5")) {
					strFizz = "Buzz";
				} else {
					strFizz = Integer.toString(i);
				}
			}
			writer.println(strFizz);
		}

		catch (FileNotFoundException e) {
			System.out.println("");
			System.exit(1);
		}
	}
}
