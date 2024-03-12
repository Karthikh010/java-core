package com.learning.core.day7;

public class StackInt 
{
	int max=4;
	int top;
	int[] arr;
	
	StackInt(int max)
	{
		this.max=max;
		this.arr= new int[max];
		this.top=-1;
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == max;
	}
	
	public void push(int val)
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
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		else
		{
			int s=arr[top];
			top--;
			return s;
		}
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		else
		{
			return arr[top];
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
	public void min()
	{
		int min= arr[top];
		for(int i=0; i<=top;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	int[] arev = new int[max];
	int i=0;
	public void reverse()
	{
		if(!isEmpty())
		{
			int temp = pop();
			arev[i] = temp;
			System.out.print(arev[i]+" ");
			i++;
			reverse();
		}
	}
}
