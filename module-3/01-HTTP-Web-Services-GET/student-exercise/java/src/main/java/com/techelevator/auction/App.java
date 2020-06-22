package com.techelevator.auction;

import java.util.Scanner;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class App {

	private static final String API_URL = "http://localhost:3000/";
	public static RestTemplate restTemplate = new RestTemplate();
	private static Scanner scanner;

	public static void main(String[] args) {
		init();
		run();
	}

	/**
	 * Here to support testing
	 */
	public static void init() {
		scanner = new Scanner(System.in);
	}

	public static Auction[] listAllAuctions() {
		return restTemplate.getForObject(API_URL + "auctions", Auction[].class);
	}

	public static Auction listDetailsForAuction() {
		Auction auctionSelect = null;
		try {
			int auctionId;
			auctionId = Integer.parseInt(scanner.nextLine());
			auctionSelect = restTemplate.getForObject(API_URL + "auctions/" + auctionId, Auction.class);
		} catch (NumberFormatException exception) {
			System.out.println("Error parsing the input for menu selection.");
		}
		return auctionSelect;
	}

	public static Auction[] findAuctionsSearchTitle() {
		Auction[] arrayOfTitles = null;

		try {
			String title = (scanner.nextLine());
			arrayOfTitles = restTemplate.getForObject(API_URL + "auctions?" + "title_like=" + title, Auction[].class);
		} catch (HttpClientErrorException exception) {
			System.out.println("Error.");
		}
		return arrayOfTitles;
	}

	public static Auction[] findAuctionsSearchPrice() {
		Auction currentBid;
		Auction[] bidInfo = null;
		double searchPrice;
		try {
			searchPrice = Double.parseDouble(scanner.nextLine());
			bidInfo = restTemplate.getForObject(API_URL + "auctions?" + "currentBid_lte=" + searchPrice,
					Auction[].class);
		} catch (Exception exception) {
			System.out.println("Error parsing the input for menu selection.");
		}
		return bidInfo;
	}

	private static void run() {
		int menuSelection = 999;

		printGreeting();

		while (menuSelection != 5) {
			try {
				menuSelection = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException exception) {
				System.out.println("Error parsing the input for menu selection.");
			}
			System.out.println("");
			if (menuSelection == 1) {
				printAuctions(listAllAuctions());
			} else if (menuSelection == 2) {
				printAuction(listDetailsForAuction());
			} else if (menuSelection == 3) {
				printAuctions(findAuctionsSearchTitle());
			} else if (menuSelection == 4) {
				printAuctions(findAuctionsSearchPrice());
			} else if (menuSelection == 5) {
				scanner.close();
				System.exit(0);
			} else {
				System.out.println("Invalid Selection");
			}
			menuSelection = 999;
			System.out.println("\nPress Enter to continue...");
			scanner.nextLine();
			printGreeting();
		}
	}

	private static void printGreeting() {
		System.out.println("");
		System.out.println("Welcome to Online Auctions! Please make a selection: ");
		System.out.println("1: List all auctions");
		System.out.println("2: List details for specific auction");
		System.out.println("3: Find auctions with a specific term in the title");
		System.out.println("4: Find auctions below a specified price");
		System.out.println("5: Exit");
		System.out.println("");
		System.out.print("Please choose an option: ");
	}

	private static void printAuctions(Auction[] auctions) {
		if (auctions != null) {
			System.out.println("--------------------------------------------");
			System.out.println("Auctions");
			System.out.println("--------------------------------------------");
			for (Auction auction : auctions) {
				System.out.println(auction.currentBidToString());
			}
		}
	}

	private static void printAuction(Auction auction) {
		if (auction != null) {
			System.out.println("--------------------------------------------");
			System.out.println("Auction Details");
			System.out.println("--------------------------------------------");
			System.out.println("Id: " + auction.getId());
			System.out.println("Title: " + auction.getTitle());
			System.out.println("Description: " + auction.getDescription());
			System.out.println("User: " + auction.getUser());
			System.out.println("Current Bid: " + auction.getCurrentBid());
			System.out.println("");
		}
	}

}