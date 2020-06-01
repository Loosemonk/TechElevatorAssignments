package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

	Less20 less20 = new Less20();
	
	
	@Test
	public void two_less_than_twenty() {
		Assert.assertEquals(true, less20.isLessThanMultipleOf20(18));

	}
	@Test
	public void one_less_than_twenty() {
		Assert.assertEquals(true, less20.isLessThanMultipleOf20(19));

	}
	@Test
	public void not_less_than_twenty() {
		Assert.assertEquals(false, less20.isLessThanMultipleOf20(20));

	}	
			
			
			
			
			
			
}
