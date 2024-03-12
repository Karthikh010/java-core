package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int m=0;
		for(int i=0;n!=0;i++)
		{
			int j=n%10;
			m=m*10+j;
			n/=10;
		}
		System.out.println(m);
	}

}
