package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class StringBitsTest {
StringBits string = new StringBits();


@Test
public void every_other_character_string() {
	Assert.assertEquals("Hlo", string.getBits("Hello"));
}
@Test
public void if_there_is_no_string() {
	Assert.assertEquals("", string.getBits(null));
}





}
