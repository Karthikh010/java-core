package com.learning.core.day9;

import java.util.Scanner;

public class D09P02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = sc.nextInt();
				
		int arr[] = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		MergeSort ms= new MergeSort();
		ms.sort(arr,0,n-1);
		for(int j=0; j<n; j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
