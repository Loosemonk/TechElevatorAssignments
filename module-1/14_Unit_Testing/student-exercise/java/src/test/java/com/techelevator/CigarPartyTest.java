package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

	CigarParty cigarParty = new CigarParty();	
	
	
	
	
	@Test
	public void successful_party_on_weekend() {
		Assert.assertEquals(true, cigarParty.haveParty(50, false));
		Assert.assertEquals(true, cigarParty.haveParty(70, true));
		Assert.assertEquals(false, cigarParty.haveParty(30, false));
	}
	
	@Test
	public void unsuccessful_party_on_weekday() {
		Assert.assertEquals(false, cigarParty.haveParty(70, false));
	
	}
	@Test
	public void successful__party_on_weekend() {
		Assert.assertEquals(true, cigarParty.haveParty(1000, true));

	}
	
	@Test
	public void unsuccessful_party_on_weekend() {
		Assert.assertEquals(false, cigarParty.haveParty(39, true));
	
	}
	
	
	
	
	
	
	
}
