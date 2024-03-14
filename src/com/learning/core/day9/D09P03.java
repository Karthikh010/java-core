package com.learning.core.day9;

import java.util.Scanner;

class LinearSearch
{
	public void search(int arr[],int key)
	{
		boolean flag = false;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag = true;
				System.out.println("Element is Present");
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Element is not Present");
		}
	}
}

public class D09P03 
{
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
		System.out.println("Enter the element to search: ");
		int key= sc.nextInt();
		
		LinearSearch l = new LinearSearch();
		l.search(arr, key);
		
	}
}
