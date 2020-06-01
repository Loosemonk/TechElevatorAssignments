package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
DateFashion dateFashion = new DateFashion();




@Test
public void if_date_stylish() {
	Assert.assertEquals(2, dateFashion.getATable(5, 10));

}
@Test
public void if_Im_stylish() {
	Assert.assertEquals(2, dateFashion.getATable(9, 3));

}

@Test
public void if_one_date_unstylish() {
	Assert.assertEquals(0, dateFashion.getATable(4, 2));

}
@Test
public void if_both_kinda_stylish() {
	Assert.assertEquals(1, dateFashion.getATable(5, 5));

}
@Test
public void if_both_unstylish() {
	Assert.assertEquals(0, dateFashion.getATable(2, 5));

}


}