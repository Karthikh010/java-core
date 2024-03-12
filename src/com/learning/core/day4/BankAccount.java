package com.learning.core.day4;

public class BankAccount 
{
	int accNo;
	String custName;
	String accType;
	float balance;
	
	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public void deposit(float amt) throws NegativeAmountException
	{
		if(amt>=0)
		{
			System.out.println("Amount Credited");
			balance+=amt;
		}
		else
		{
			throw new NegativeAmountException("Negative Amount");
		}
	}
	
	public float getBalannce()throws LowBalanceException , NegativeAmountException
	{
		if(accType.equals("saving") && balance >=1000)
		{
			return balance;
		}
		else if(accType.equals("current") && balance >=5000)
		{
			return balance;
		}
		else if(accType.equals("saving") && balance<1000)
		{
			throw new LowBalanceException("Low Balance");
		}
		else if(accType.equals("current") && balance<5000)
		{
			throw new LowBalanceException("Low Balance");
		}
		else
		{
			throw new NegativeAmountException("Negative Amount");
		}
	}
}
