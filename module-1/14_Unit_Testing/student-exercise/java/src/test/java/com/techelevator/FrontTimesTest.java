package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
	
	
		FrontTimes frontTimes = new FrontTimes();


		@Test
		public void if_more_than_three() {
			Assert.assertEquals("ChoChoCho", frontTimes.generateString("Chocolate", 3));

		}
		@Test
		public void if_less_than_three() {
			Assert.assertEquals("AbAb", frontTimes.generateString("Ab", 2));

		}
		@Test
		public void if_three_characters_only() {
			Assert.assertEquals("AbcAbcAbc", frontTimes.generateString("Abc", 3));

		}
		@Test
		public void if_null() {
			Assert.assertEquals("", frontTimes.generateString(null, 3));

		}

}
