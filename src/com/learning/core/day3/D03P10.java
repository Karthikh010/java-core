package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
		int count=0;
		int len=s.length();
		for(int i=0;i<len/2;i++)
		{
			//System.out.println(s.substring(0,i+1)+"  "+s.substring(len-i-1));
			if(s.substring(0,i+1).equals(s.substring(len-i-1)))//if(s.charAt(i)==s.charAt(s.length()-i-1))
			{
				count=i+1;
			}
		}
		System.out.print(count);

	}

}