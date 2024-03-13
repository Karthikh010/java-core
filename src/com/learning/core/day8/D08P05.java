package com.learning.core.day8;

import java.util.Scanner;

public class D08P05 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the Queue:");
		int n = sc.nextInt();
		
		QueueArray q = new QueueArray(n);
		System.out.println("Enter the queue elements: ");
		for(int i=0; i<n; i++)
		{
			q.enqueue(sc.nextInt());
		}
		
		QueueArray[] qa = new QueueArray[2];
		QueueArray oq = new QueueArray(n);
		QueueArray eq = new QueueArray(n);
		
		while(!q.isEmpty())
		{
			int data=q.dequeue();
			if(data%2==0)
			{
				eq.enqueue(data);
			}
			else
			{
				oq.enqueue(data);
			}
		}
		
		qa[0]=eq;
		qa[1]=oq;
		
		System.out.println("Odd Queue: ");
		oq.display();
		System.out.println("Even Queue: ");
		eq.display();
	}

}
