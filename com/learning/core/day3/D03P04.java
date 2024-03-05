package com.learning.core.day3;

import java.util.Arrays;
import java.util.Scanner;

public class D03P04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array:");
		int[] arr= new int[n];
		int index = 0;
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		for(int j=0; j<n; j++)
		{
			//System.out.println(arr[j]);
			for(int k=j+1; k<n; k++)
			{
				if(arr[j]==arr[k])
				{
					index=k;
				}
			}
		}
		System.out.println("index : "+index);
	}

}
