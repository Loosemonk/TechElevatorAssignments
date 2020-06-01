package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
MaxEnd3 maxEnd = new MaxEnd3();


int [] nums;



@Test
public void max_integer_between_1_and_3_in_array_in_first_position() {
Assert.assertArrayEquals(new int [] {3,3,3}, maxEnd.makeArray(new int [] {3,2,1})); 
}	
@Test
public void max_integer_between_1_and_3_in_array_in_the_third_position() {
Assert.assertArrayEquals(new int [] {7,7,7}, maxEnd.makeArray(new int [] {1,7,7})); 
}	
@Test
public void three_integer_in_array_are_the_same() {
Assert.assertArrayEquals(new int [] {2,2,2}, maxEnd.makeArray(new int [] {2,2,2})); 
}	

/*
@Test
public void no_max_integer_in_array() {
Assert.assertArrayEquals(new int [] {3,3,3}, maxEnd.makeArray(new int [] {1,2,3})); 
}	
*/

}
