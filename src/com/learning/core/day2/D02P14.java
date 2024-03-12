package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int o=1;;
		for(int i=1; i<=m; i++)
			o*=n;
		System.out.println(o);
	}
}
