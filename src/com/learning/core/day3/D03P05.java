package com.learning.core.day3;

import java.util.Scanner;

public class D03P05 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the array:");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int k=2;
		
		for(int j=0; j<n; j++)
		{
			int n1=arr[j];
			for(int x=j+1; x<n; x++)
			{
				int n2= arr[x];
				System.out.print(n1+" "+n2+", ");
			}
		}
	}
}

