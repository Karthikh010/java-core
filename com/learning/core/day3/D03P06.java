<<<<<<< HEAD
package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		
		System.out.println("Enter n :");
		int n=sc.nextInt();

		int v=0;
	
		StringBuilder vowel =new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			char c =s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='U' || c=='O'|| c=='I' || c=='E' || c=='A')
			{
				v++;
				vowel.insert(0,c);
			}
		}
		
		if(n>v)
		{
			System.out.println("Mismatch in Vowel count");
		}
		else
		{
			String a =vowel.toString();
			//System.out.println(a);
			char[] ch =new char[n];
			for(int j=0; j<n;j++)
			{
				ch[j]=a.charAt(j);
				System.out.print(ch[j]);
			}
//			String nv= ch.toString();
//			System.out.println("\n"+nv);
		}
	}

}

=======
package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		
		System.out.println("Enter n :");
		int n=sc.nextInt();

		int v=0;
	
		StringBuilder vowel =new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			char c =s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='U' || c=='O'|| c=='I' || c=='E' || c=='A')
			{
				v++;
				vowel.insert(0,c);
			}
		}
		
		if(n>v)
		{
			System.out.println("Mismatch in Vowel count");
		}
		else
		{
			String a =vowel.toString();
			//System.out.println(a);
			char[] ch =new char[n];
			for(int j=0; j<n;j++)
			{
				ch[j]=a.charAt(j);
				System.out.print(ch[j]);
			}
//			String nv= ch.toString();
//			System.out.println("\n"+nv);
		}
	}

}

>>>>>>> 2fe23d38fc0011e70d3e80d5a62599f49f5284b5
