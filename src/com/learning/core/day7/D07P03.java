package com.learning.core.day7;

import java.util.Scanner;

class Stack
{
	int max=8;
	int top;
	char arr[]= new char[max];
	
	Stack()
	{
		top=-1;
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == max;
	}
	
	public void push(char val)
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
			char s=arr[top];
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
	 public void reverse()
	 {
		 char[] rev= new char[max];
		 int j=0;
		 for(int i=top; i>=0;i--)
		 {
			 rev[j]=arr[i];
			 System.out.print(rev[j]);
			 j++; 
		 }
	 }
}

public class D07P03 
{

	public static void main(String[] args) 
	{
		String st="JavaQuiz";
		Stack s = new Stack();
		for(int i=0; i<st.length();i++)
		{
			s.push(st.charAt(i));
		}
		s.reverse();
	}

}
