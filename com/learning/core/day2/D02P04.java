package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers : "); 
		int n=sc.nextInt();
		int m=sc.nextInt();
		int o=sc.nextInt();
		if(m>n && m>o)
		{
			System.out.println(m);
		}
		else if(n>o)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(o);
		}
	}

}
