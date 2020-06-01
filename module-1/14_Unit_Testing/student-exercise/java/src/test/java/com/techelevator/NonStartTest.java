package com.techelevator;

import org.junit.Test;
import org.junit.Assert;


public class NonStartTest {
NonStart nonStart = new NonStart();



@Test
public void both_strings_return_concatentation_and_are_longer_than_one_character() {
	Assert.assertEquals("ellohere", nonStart.getPartialString("Hello", "there"));
		
}

@Test
public void string_a_is_zero_characters_long() {
	Assert.assertEquals("here", nonStart.getPartialString("", "there"));
		
}
@Test
public void string_b_is_zero_characters_long() {
	Assert.assertEquals("ello", nonStart.getPartialString("Hello", ""));
		
}












}
