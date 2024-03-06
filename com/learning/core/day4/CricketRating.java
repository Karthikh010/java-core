package com.learning.core.day4;

public class CricketRating 
{
	String playerName, coins;
	float critic1, critic2, critic3, avgRating;
	
	
	public CricketRating(String playerName, float critic1, float critic2, float critic3) 
	{
		super();
		this.playerName = playerName;
		//this.coins = coins;
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
		//this.avgRating = avgRating;
	}
	
	void calculateAverageRating(float critic1,float critic2)
	{
		avgRating= (critic1+critic2)/2;
	}
	
	void calculateAverageRating(float critic1,float critic2,float critic3)
	{
		avgRating= (critic1+critic2+critic3)/3;
	}
	
	String calculateCoins() throws NotEligibleException
	{
		if(avgRating>=7)
		{
			coins= "Gold";
		}
		else if(avgRating>=5 && avgRating<7)
		{
			coins= "Silver";
		}
		else if(avgRating>=2 && avgRating<5)
		{
			coins= "Copper";
		}
		else if(avgRating<2)
		{
			throw new NotEligibleException("NotEligibleException");
		}
		return coins;
	}
	
	void display()
	{
		System.out.println(playerName+" "+avgRating);
	}
}
