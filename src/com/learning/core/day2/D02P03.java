package com.learning.core.day2;

import java.util.Scanner;

public class D02P03 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the operator : "); 
		String o =sc.nextLine();
		System.out.println("Enter the first number : "); 
		int a =sc.nextInt();
		System.out.println("Enter the second number : "); 
		int b =sc.nextInt();
//		System.out.println(o);
		switch(o)
		{
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "%":
			System.out.println(a%b);
			break;
		default:
			System.out.println("enter valid operator");
		}

	}

}
