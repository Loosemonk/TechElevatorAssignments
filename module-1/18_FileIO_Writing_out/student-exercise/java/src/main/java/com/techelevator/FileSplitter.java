
package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {

		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("Enter a file you want to split?");
			String filePath = userInput.nextLine();

			try {
				File readFile = getFilePath(filePath);
				System.out.println("How many lines do you want for a single split file?");
				int linesPerFile = 0;
				boolean isValidValue = false;

				while (!isValidValue) {
					try {
						linesPerFile = userInput.nextInt();
						if (linesPerFile > 0) {
							isValidValue = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("That was not a valid number. Try again.");
					} finally {
						userInput.nextLine();
					}
				}
				
				try (Scanner fileInput = new Scanner(readFile)) {
					int fileAmount = 1;
					while (fileInput.hasNextLine()) {
						String fileSplit = getNextFileName(readFile, fileAmount);
						File outputFile = new File(readFile.getParentFile(), fileSplit);
						try (PrintWriter writer = new PrintWriter(outputFile)) {
							for (int i = 0; i < linesPerFile; i++) {
								if (fileInput.hasNextLine()) {
									writer.println(fileInput.nextLine());
								} else {
									break;
								}
							}
						}

						fileAmount++;
					}
				}

			} catch (IOException ex) {
				System.out.println(ex.getMessage());
				System.exit(1);
			}
		}
	}

	private static File getFilePath(String filePath) throws IOException {
		File ourFile = new File(filePath);

		if (!ourFile.exists()) {
			throw new FileNotFoundException("There was no file at " + filePath);
		}

		if (!ourFile.isFile()) {
			throw new IOException(filePath + " is not a file.");
		}

		return ourFile;
	}

	private static String getNextFileName(File inputFile, int count) {
		String fileName = inputFile.getName();
		String extension = fileName.substring(fileName.lastIndexOf('.'));
		String nameWithNoExtension = fileName.substring(0, fileName.lastIndexOf('.'));
		return nameWithNoExtension + "-" + count + extension;
	}

}