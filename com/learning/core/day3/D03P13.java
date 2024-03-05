package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String s1=s.replace(" ","%20");
		System.out.println(s1);
	}

}
