package com.learning.core.day7;

class Node
{
	double value;
	Node next;
}

public class LinkedListStack 
{
	Node head;
	
	public LinkedListStack()
	{
		head= null;
	}
	public void push(double data)
	{
		Node extraNode=head;
		head=new Node();
		head.value=data;
		head.next=extraNode;
	}
	public boolean isEmpty()
	{
		return head == null;
	}
	public double pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return 0.0;
		}
		else
		{
			double topValue = head.value;
			head=head.next;
			return topValue;
		}
	}
	public void display()
	{
		if (head == null) 
		{
            System.out.printf("\nStack Underflow");
		}
		else
		{
			Node temp = head;
			System.out.println("\nThe Stack is: ");
			while(temp != null)
			{
				System.out.print(temp.value+" ");
				temp =  temp.next;
			}
			System.out.println("\n");
		}
	}
}
