package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the percentage of marks");
		int n=sc.nextInt();
		if(n>=60)
		{
			System.out.println("A Greade");
		}
		else if(n>=45 && n<60)
		{
			System.out.println("B Grade");
		}
		else if(n>=35 && n<45)
		{
			System.out.println("C Grade");
		}
		else if(n<35)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Enter valid percentage");
		}
	}

}
