package com.learning.core.day7;

public class StackString 
{
	int max=4;
	int top;
	String arr[]= new String[max];
	
	StackString()
	{
		top=-1;
		//this.max= max;
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == max;
	}
	
	public void push(String val)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top=top+1;
			arr[top]=val;
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			String s=arr[top];
			top--;
			//return s;
		}
	}
	public void display()
	{
		System.out.println("\nThe Stack is: ");
		for(int i=0; i<=top; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
