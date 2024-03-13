package com.learning.core.day8;

class Node
{
	int value;
	Node next;
	public Node(int value)
	{
		this.value=value;
		this.next=null;
	}
}
public class QueueLL 
{
	Node front,rear;
	
	public void enqueue(int data)
	{
		if(front==null)
		{
			rear=new Node(data);
			front=rear;
		}
		else
		{
			Node newNode= new Node(data);
			rear.next=newNode;
			rear=newNode;
		}
	}
	public int dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		else
		{
			int res=front.value;
			front=front.next;
			return res;
		}
	}
}
