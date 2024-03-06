package com.learning.core.day4;

import java.util.Scanner;

public class D04P02 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String pname =sc.nextLine();
		System.out.println("Enter Critic1 rating: ");
		float cl =sc.nextFloat();
		System.out.println("Enter Critic2 rating: ");
		float c2 =sc.nextFloat();
		System.out.println("Enter Critic3 rating: ");
		float c3 =sc.nextFloat();
		
		try
		{
			CricketRating cr= new CricketRating(pname, cl, c2, c3);
			cr.calculateAverageRating(cl, c2, c3);
			cr.display();
			System.out.println(cr.calculateCoins());
		}
		catch(NotEligibleException e)
		{
			e.printStackTrace();
		}

	}

}
