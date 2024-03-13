package com.learning.core.day8;

import java.util.Scanner;

class StringQueue 
{
	int front=-1;
	int rear=-1;
	int n;
	String[] arr;
	
	public StringQueue (int n)
	{
		this.n=n;
		arr= new String[n];
	}
	public boolean isFull()
	{
		return rear == n-1;
	}
	public boolean isEmpty()
	{
		return front== -1 && rear == -1;
	}
	
	public void enqueue(String data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full.");
		}
		else if(isEmpty())
		{
			front=rear=0;
			arr[rear]=data;
		}
		else
		{
			rear++;
			arr[rear]=data;
		}
	}
	public String dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return null;
		}
		else if(front==rear)
		{
			String top = arr[front];
			front=rear=-1;
			return top;
		}
		else
		{
			String top = arr[front];
			front++;
			return top;
		}
	}
	public String peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return null;
		}
		else
		{
			String top = arr[front];
			return top;
		}
	}
	public void display()
	{
		
		for(int i=front; i<=rear; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}

public class D08P04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the Queue:");
		int n = sc.nextInt();
		
		StringQueue sq = new StringQueue(n);
		if(n!=0) 
		{
			System.out.println("Enter the queue elements: ");
		}
		for(int i=0; i<n; i++)
		{
			sq.enqueue(sc.next());
		}
		
		if(sq.isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Not Empty");
		}
	}
}
