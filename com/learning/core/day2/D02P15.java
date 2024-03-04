package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 
{
	public static void main(String[] args) 
	{
		int p=0,e=0,z=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int a[] = new int[n];  
		System.out.println("Enter the "+n+" numbers : ");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0; j<n; j++)
		{
			if(a[j]>0)
			{
				p+=1;
			}
			else if(a[j]<0)
			{
				e+=1;
			}
			else
			{
				z+=1;
			}
		}
		System.out.println("No of positive Numbers: "+p);
		System.out.println("No of negative Numbers: "+e);
		System.out.println("No of zeros Numbers: "+z);
	}
}
