package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


/**
 * https://learning.oreilly.com/videos/core-java-data/  
 * Lesson 5.1 - using var : it's not a keyword, it's a pseudo type
 */


public class VarType 
{

	
	public static Map <String, List <Map.Entry<String, Long> >> get () 
	{
		return null;
		
	}

	public static void main (String [] args) 
	{
		
		Map <String, List <Map.Entry<String, Long> >> map = get();
		
		List <String> words = Arrays.asList("short word", "long word", "medium word");
		
		/*
		 * Stream is a way of processing a list of data.
		 * 
		 * */
		
		//Stream <String> streamOfString = words.stream();
		var streamOfString = words.stream();
		
		streamOfString.forEach 					// for each
			(item -> System.out.println(item)); // set this behaviour : print item
		
		
		
		/*
		 * a second Stream:
		 * from the initial list -> to a map -> 
		 * 
		 * 'short word' -> map -> "SHORT WORD"
		 * */
		var streamOfStringUpper = words.stream().map( w -> w.length() ) ; 
		streamOfStringUpper.forEach(item2 -> System.out.println(item2));
		
	}


}
