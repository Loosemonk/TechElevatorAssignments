package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
	Lucky13 lucky13 = new Lucky13();

	int[] nums;
	
	@Test
public void no_ones_or_threes_in_array() {
	Assert.assertEquals(true, lucky13.getLucky(nums = new int[] {2,4,5}));
}	
	@Test
public void no_ones_in_array() {
	Assert.assertEquals(false, lucky13.getLucky(nums = new int[] {3,7,9}));
}	
		
	@Test
public void no_threes_in_array() {
	Assert.assertEquals(false, lucky13.getLucky(nums = new int[] {1,6,5}));
}	
	@Test
public void both_ones_and_threes_in_array() {
	Assert.assertEquals(true, lucky13.getLucky(nums = new int[] {7,4,7}));
}	
	@Test
public void null_passes() {
	Assert.assertEquals(true, lucky13.getLucky(nums = null));
}			

}
