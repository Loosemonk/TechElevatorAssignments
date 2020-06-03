package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		File fileInput = getInputFileFromUser();
		String word = wordToSearch();
		searchWords(fileInput, word);

	}

	private static File getInputFileFromUser() {
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner(System.in);
		System.out.println("Please enter path of file");
		String path = fileInput.nextLine();
		File inputFile = new File(path);
		if (!inputFile.exists()) {
			System.out.println(path + " File does not exist");
			System.exit(1);
		} else if (!inputFile.isFile()) {
			System.out.println(path + " is not a file");
			System.exit(1);
		}
		return inputFile;

	}

	public static String wordToSearch() {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the word you would like to search for");
		String wordInput = userInput.nextLine();
		return wordInput;
	}

	public static String searchWords(File fileInput, String wordInput) {
		@SuppressWarnings("resource")
		Scanner caseSensitive = new Scanner(System.in);
		System.out.println("Is your word search case sensitive (Y/N)?");
		String yesOrNo = caseSensitive.nextLine().toLowerCase().substring(0, 1);
		
		
		try(Scanner input = new Scanner(fileInput)){
			int wordAmount = 0;
			
			while (input.hasNextLine()) {
				if (yesOrNo.equals("n")) {
					wordAmount++;
					String line = input.nextLine();
					if (line.toLowerCase().contains(wordInput.toLowerCase())) {
						System.out.println(wordAmount + ") " + line);
					}else {
				}
			}else { String line = input.nextLine();
			if (line.contains(wordInput)) {
				System.out.println(wordAmount + ") " + line);
			}
			}
		}
		
	}catch (Exception e) {
		System.out.println("File does not exist");
	}
	
	return "";
	}

}