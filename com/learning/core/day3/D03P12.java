<<<<<<< HEAD
package com.learning.core.day3;

import java.util.Arrays;
import java.util.Scanner;

public class D03P12 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		int f=0;
		if(s.length()<4)
		{
			System.out.println("no");
		}
		else 
		{
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			for (int i = 0; i < ch.length - 1; i++)
			{
				if(ch[i]==ch[i+1])
				{
					System.out.println("no");
					f=1;
					break;
				}
			}
			if(f!=1)
			{
				System.out.println("yes");
			}
		}
	}

}
=======
package com.learning.core.day3;

import java.util.Arrays;
import java.util.Scanner;

public class D03P12 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		int f=0;
		if(s.length()<4)
		{
			System.out.println("no");
		}
		else 
		{
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			for (int i = 0; i < ch.length - 1; i++)
			{
				if(ch[i]==ch[i+1])
				{
					System.out.println("no");
					f=1;
					break;
				}
			}
			if(f!=1)
			{
				System.out.println("yes");
			}
		}
	}

}
>>>>>>> 2fe23d38fc0011e70d3e80d5a62599f49f5284b5
