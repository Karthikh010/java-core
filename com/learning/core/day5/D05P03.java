package com.learning.core.day5;

import java.util.HashSet;

public class D05P03 
{
	public static void main(String[] args) 
	{
		Product p1=new Product("P001","Maruti 800");
		Product p2=new Product("P002","Maruti Zen");
		Product p3=new Product("P003","Maruti Dezire");
		Product p4=new Product("P004","Maruti Alto");
		
		HashSet<Product> pro= new HashSet<Product>();
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		pro.add(p4);
		
		//System.out.println(pro);
		for(Product p : pro)
		{
			System.out.println(p);
		}
	}
}
