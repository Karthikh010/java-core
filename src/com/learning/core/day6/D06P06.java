package com.learning.core.day6;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Car1 implements Comparable<Car1>
{
	private String name;
	private double price;
	
	public Car1() 
	{
		super();
	}

	public Car1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car1 other = (Car1) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return name + " " + price;
	}

	@Override
	public int compareTo(Car1 o) 
	{
		 return (int) (o.price - this.price);
	}
	
}

public class D06P06 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,Car1> car= new TreeMap<>();
		
		car.put(1,new Car1("Bugatti",80050));
		car.put(2,new Car1("Swift",305000));
		car.put(3,new Car1("Audi",600100));
		car.put(4,new Car1("Benz",900000));
		
		 for (Map.Entry<Integer, Car1> e: car.descendingMap().entrySet()) 
		 {
			 Car1 c=e.getValue();
			 System.out.println(c);
	     }

	}

}
