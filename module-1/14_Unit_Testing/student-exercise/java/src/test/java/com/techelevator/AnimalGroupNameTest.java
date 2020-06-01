package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;



public class AnimalGroupNameTest {


AnimalGroupName animalGroupName = new AnimalGroupName();




@Test
public void does_animal_name_return_correct_group() {
	Assert.assertEquals("Herd", animalGroupName.getHerd("elephant"));
}
@Test
public void does_animal_name_return_correct_group_while_capitalized() {
	Assert.assertEquals("Herd", animalGroupName.getHerd("ELEPHANT"));
}
@Test
public void does_animal_name_return_unknown() {
	Assert.assertEquals("unknown", animalGroupName.getHerd(""));
}
@Test
public void does_animal_name_return_correct_group_mixed_casing() {
	Assert.assertEquals("Herd", animalGroupName.getHerd("eLePhAnT"));
}
@Test
public void does_no_animal_name_return_group() {
	Assert.assertEquals("unknown", animalGroupName.getHerd(null));
}
















}