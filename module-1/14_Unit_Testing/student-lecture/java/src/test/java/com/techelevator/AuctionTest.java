package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AuctionTest {
private Auction a;

@Before
public void setup() {
	a = new Auction ("my item");
}
	
	
	
	
	
	@Test
public void constructor_sets_all_data_correctly() {
	//Arrange and Act
	Auction a = new Auction("my item");

	//Assert
	Assert.assertEquals("my item", a. getItemForSale());

}

@Test
public void place_bid_test() {
	
	Bid [] placeBids = new Bid[] {new Bid("Katie", 1), new Bid("Abel", 10)};

for (Bid b : placeBids) {
	a.placeBid(b);
}
	
	Assert.assertArrayEquals(placeBids, a.getAllBids().toArray());
	
}

@Test
public void get_high_bid_with_no_bids_has_bid_amount_zero_and_bidder_empty_string


}
