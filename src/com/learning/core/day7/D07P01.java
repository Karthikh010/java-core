package com.learning.core.day7;

public class D07P01 
{
	public static void main(String[] args) 
	{
		StackString s = new StackString();
		
		s.push("Hello");
		s.push("world");
		s.push("java");
		s.push("Programming");
		
		s.display();
		
		s.pop();
		s.display();
	}
}
