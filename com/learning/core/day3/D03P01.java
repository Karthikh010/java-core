package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		int n=s.length();
		System.out.println("Lenght of the String is "+n);
		String s1=s.toUpperCase();
		char[] c =new char[n];
		for(int i=n-1;i>=0;i--)
		{
			c[i]=s1.charAt(i);
		}
		String s2= c.toString();
		if(s1.equals(s2))
		{
			System.out.println("It is a Palindrome.");
		}
		else
		{
			System.out.println("It is a not Palindrome.");
		}
	}

}
