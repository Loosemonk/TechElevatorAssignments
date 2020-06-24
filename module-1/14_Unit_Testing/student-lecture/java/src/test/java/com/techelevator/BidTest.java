package com.techelevator;

import org.junit.Test;

import junit.framework.Assert;

public class BidTest {
@Test
public void create_new_bid_sets_bidder_correctly() {
	
	//Arrange
	Bid b = new Bid("Katie", 1);
	//Act 
	//Assert
	Assert.assertEquals("Katie", b.getBidder());

}	

@Test
public void creat_new_bid_sets_bidder_correctly() {
	
	//Arrange
	Bid b = new Bid("Katie", 2);
	//Act 
	//Assert
	Assert.assertEquals("Katie", b.getBidder());

}
@Test
public void no_negative_bids_allowed_make_bid_amount_zero(){
	//Arrange
	Bid b = new Bid("Katie",-1);
	//Act 
	//Assert
	Assert.assertEquals("Katie", b.getBidder());

}

}
