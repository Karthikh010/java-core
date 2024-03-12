package com.learning.core.day4;

import java.util.Scanner;

public class D04P01 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int acno=sc.nextInt();
		System.out.println("Enter Name: ");
		String cname =sc.nextLine();
		System.out.println("Enter Account Type: ");
		String acty =sc.nextLine();
		System.out.println("Enter Account Balance: ");
		float bal =sc.nextFloat();
		try
		{
			BankAccount ba=new BankAccount(acno, cname, acty, bal);
			System.out.println("Enter amount to deposite: ");
			float amt=sc.nextFloat();
			ba.deposit(amt);
			System.out.println("New Balance is : "+ba.getBalannce());
		}
		catch(NegativeAmountException | LowBalanceException e)
		{
			e.printStackTrace();
		}
	}

}
