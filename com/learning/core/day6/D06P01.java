package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D06P01 {

	public static void main(String[] args) 
	{
		Map<String,Long> phoneBook= new HashMap<String,Long>();
		
		phoneBook.put("Amal",998787823L);
		phoneBook.put("Manvitha",937843978L);
		phoneBook.put("Joseph",7882221113L);
		phoneBook.put("Smith",8293893311L);
		phoneBook.put("Kathe",7234560011L);
		
		//System.out.println(phoneBook);
		for(Entry<String, Long> e: phoneBook.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
