package com.learning.core.day6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class D06P09 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,Car> car= new TreeMap<>();
		
		car.put(1,new Car("Bugatti",80050));
		car.put(2,new Car("Swift",305000));
		car.put(3,new Car("Audi",600100));
		car.put(4,new Car("Benz",900000));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price: ");
		Double p =sc.nextDouble();
		System.out.println("Enter the new name: ");
		String nn =sc.next();

		for (Map.Entry<Integer, Car> e: car.entrySet()) 
		 {
			 Car c=e.getValue();
			 if(c.getPrice()== p)
			 {
				 c.setName(nn);
				 System.out.println(c);
			 }
	     }
	}

}
