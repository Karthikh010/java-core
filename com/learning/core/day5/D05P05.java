package com.learning.core.day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class D05P05 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Product p1=new Product("P001","Maruti 800");
		Product p2=new Product("P002","Maruti Zen");
		Product p3=new Product("P003","Maruti Dezire");
		Product p4=new Product("P004","Maruti Alto");
		
		HashSet<Product> pro= new HashSet<Product>();
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		pro.add(p4);
		
		System.out.println("Enter the Product Id to be removed: ");
		String id=sc.nextLine();
		
		for(Product p : pro)
		{
			if(p.getpID().equals(id))
			{
				pro.remove(p);
				break;
			}
		}
		for(Product p : pro)
		{
			System.out.println(p);
		}
	}
}
