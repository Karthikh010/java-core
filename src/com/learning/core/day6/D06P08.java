package com.learning.core.day6;

import java.util.Map;
import java.util.TreeMap;

public class D06P08 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,Car> car= new TreeMap<>();
		
		car.put(1,new Car("Bugatti",80050));
		car.put(2,new Car("Swift",305000));
		car.put(3,new Car("Audi",600100));
		car.put(4,new Car("Benz",900000));
		
		Map.Entry<Integer, Car> max= car.lastEntry();
		int n = max.getKey();
		car.remove(n);
		
		for (Car c : car.values()) 
		 {
			 System.out.println(c);
	     }
		
	}

}
