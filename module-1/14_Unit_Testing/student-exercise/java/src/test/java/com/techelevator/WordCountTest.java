package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {
WordCount wordCount = new WordCount();
Map<Integer, String> wordMap = new HashMap <Integer, String>();
String[] input;


@Test
public void dictionary_array_of_strings_that_shows_value_of_how_many_times_a_string_appears() {
	Map<String, Integer> output = new HashMap<>();
	output.put("ba", 2);
	output.put("black", 1);
	output.put("sheep", 1);
	Assert.assertEquals(output , wordCount.getCount(input = new String[] {"ba","ba", "black", "sheep"}));
	
	
	
}

@Test
public void string_array_is_null() {
	Map<String, Integer> outputNull = new HashMap<>();
	Assert.assertEquals(outputNull , wordCount.getCount(input = null));
 
}

}
