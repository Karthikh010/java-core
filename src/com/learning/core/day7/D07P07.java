package com.learning.core.day7;

import java.util.Scanner;

public class D07P07 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int max = sc.nextInt();
        StackInt s = new StackInt(max);
        
        System.out.println("Enter integers to push onto the stack:");
        for (int i = 0; i < max; i++) 
        {
            int e = sc.nextInt();
            s.push(e);
        }
        int top = s.peek();
        if(top%2 == 0)
        {
        	System.out.println(true);
        }
        else
        {
        	System.out.println(false);
        }
	}

}
