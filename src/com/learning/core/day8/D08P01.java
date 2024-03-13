package com.learning.core.day8;

import java.util.Scanner;

public class D08P01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the Queue:");
		int n = sc.nextInt();
		
		QueueArray qa = new QueueArray(n);
		System.out.println("Enter the queue elements: ");
		for(int i=0; i<n; i++)
		{
			qa.enqueue(sc.nextInt());
		}
				
		System.out.println("Elements in queue: ");
		qa.display();
		
		qa.dequeue();
		
		System.out.println("After removing first element: ");
		qa.display();
	}

}
