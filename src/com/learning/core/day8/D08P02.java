package com.learning.core.day8;

import java.util.Scanner;

public class D08P02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		QueueLL qll = new QueueLL();
		
		System.out.println("Enter 5 queue elements: ");
		for(int i=0; i<5; i++)
		{
			qll.enqueue(sc.nextInt());
		}
				
		System.out.println(qll.dequeue());
		System.out.println(qll.dequeue());
	}
}
