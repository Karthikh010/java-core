package com.learning.core.day4;

import java.util.Scanner;

public class D04P03 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Applicant Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the post applied: ");
		String apost=sc.nextLine();
		System.out.println("Enter Applicant Age: ");
		int age=sc.nextInt();
		
		try 
		{
			Applicant a=new Applicant(name, apost, age);
			Validator v=new Validator();
			v.validate(a);
		}
		catch(CatheyBankException e)
		{
			e.printStackTrace();
		}
		
	}

}
