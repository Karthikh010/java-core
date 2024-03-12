package com.learning.core.day7;

public class D07P02 {

	public static void main(String[] args) 
	{
		LinkedListStack ls = new LinkedListStack();
		
		ls.push(10);
		ls.push(20);
		ls.push(30);
		ls.push(40);
		
		ls.display();
		
		System.out.println("Popped :"+ls.pop());
		System.out.println("Popped :"+ls.pop());
		
		ls.display();
	}

}
