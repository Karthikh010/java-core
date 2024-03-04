package com.learning.core.day2;

import java.util.Scanner;

public class D02P17 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=2; i<=n; i++)
		{
			int f=1;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					f=0;
					break;
				}
			}
			if(f==1)
			{
				System.out.print(i+", ");
			}
		}
	}
}
