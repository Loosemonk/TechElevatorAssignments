package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {
SameFirstLast same = new SameFirstLast();


int[] nums;


@Test
public void first_and_last_value_in_array_are_the_same() {
Assert.assertEquals(true, same.isItTheSame(nums = new int[] {2,4,4,2}));
}	

@Test
public void array_is_only_1() {
Assert.assertEquals(true, same.isItTheSame(nums = new int[] {0}));
}	
@Test
public void array_is_nothing() {
Assert.assertEquals(false, same.isItTheSame(nums = new int[] {}));
}	
@Test
public void first_and_last_value_in_array_are_not_the_same() {
Assert.assertEquals(false, same.isItTheSame(nums = new int[] {3,4,2}));
}	
@Test
public void value_in_array_are_not_the_same() {
Assert.assertEquals(true, same.isItTheSame(nums = new int[] {3,3}));
}	

@Test
public void array_is_null_() {
Assert.assertEquals(false, same.isItTheSame(nums = null));
}	






}
