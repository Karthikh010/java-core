package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int m=1;
		for(int i=1; i<=n; i++)
			m*=i;
		System.out.println(m);
	}

}
