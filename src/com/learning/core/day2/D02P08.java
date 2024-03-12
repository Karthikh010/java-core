package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first Number");
		int n=sc.nextInt();
		System.out.println("Enter the second Number");
		int m=sc.nextInt();
		int o=0;
		for(int i=n; i<=m; i++)
			o+=i;
		System.out.println(o);
	}

}
