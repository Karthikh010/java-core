package com.learning.core.day8;

public class QueueArray 
{
	int front=-1;
	int rear=-1;
	int n;
	int[] arr;
	
	public QueueArray(int n)
	{
		this.n=n;
		arr= new int[n];
	}
	public boolean isFull()
	{
		return rear == n-1;
	}
	public boolean isEmpty()
	{
		return front== -1 && rear == -1;
	}
	
	public void enqueue(int data)
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
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		else if(front==rear)
		{
			int top = arr[front];
			front=rear=-1;
			return top;
		}
		else
		{
			int top = arr[front];
			front++;
			return top;
		}
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		else
		{
			int top = arr[front];
			return top;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
		}
		else
		{
			for(int i=front; i<=rear; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
		}
	}
}
