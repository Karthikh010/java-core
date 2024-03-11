package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class D06P02 
{
	public static void main(String[] args) 
	{
		Map<String,Long> phoneBook= new HashMap<String,Long>();
		
		phoneBook.put("Amal",998787823L);
		phoneBook.put("Manvitha",937843978L);
		phoneBook.put("Joseph",7882221113L);
		phoneBook.put("Smith",8293893311L);
		phoneBook.put("Kathe",7234560011L);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name: ");
		String n= sc.next();
		
		for(Entry<String, Long> e: phoneBook.entrySet())
		{
			if(e.getKey().equals(n))
			{
				System.out.println(e.getValue());
			}
		}
	}
}
