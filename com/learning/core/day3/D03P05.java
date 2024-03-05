package com.learning.core.day3;

import java.util.Scanner;

public class D03P05 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array:");
		int[] arr= new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter k :");
		int k=sc.nextInt();
		//System.out.println(Arrays.toString(arr));
		for(int j=0; j<n; j++)
		{
			//System.out.println(arr[j]);
			System.out.print(arr[j]);
			for(int x=0; x<k; x++)
			{
				for(int z=j+1; z<n; z++)
				{
					System.out.print(" "+arr[z]);
				}
				System.out.print(", ");
			}
		}
	}
}
// not completed
