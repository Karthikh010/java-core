<<<<<<< HEAD
package com.learning.core.day3;

import java.util.Scanner;

public class D03P14 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in array1");
		int n1=sc.nextInt();
		
		int[] a1=new int[n1];
		
		System.out.println("Enter sorted array1");
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter number of elements in array2");
		int n2=sc.nextInt();
		
		int[] a2=new int[n2];
		
		System.out.println("Enter sorted array2");
		for(int j=0;j<n2;j++)
		{
			a2[j]=sc.nextInt();
		}
//		int[] u=new int[n1+n2];
//		int[] i=new int[n1+n2];
//		for(int k=0;k<n1;k++)
//		{
//			for(int l=0;l<n2;l++)
//			{
//				
//			}
//		}
		int i1=0,i2=0;
		System.out.print("Union : ");
		while(i1<n1 && i2<n2)
		{
			if(a1[i1]<a2[i2])
			{
				System.out.print(a1[i1]+" ");
				i1++;
			}
			else if(a1[i1]>a2[i2])
			{
				System.out.print(a2[i2]+" ");
				i2++;
			}
			else if(a1[i1]==a2[i2])
			{
				System.out.print(a1[i1]+" ");
				i1++;
				i2++;
			}
		}
		while(i1<n1)
		{
			System.out.print(a1[i1]+" ");
			i1++;
		}
		while(i2<n2)
		{
			System.out.print(a2[i2]+" ");
			i2++;
		}
		
		int j1=0,j2=0;
		System.out.print("\n Intersection : ");
		while(j1<n1 && j2<n2)
		{
			if(a1[j1]==a2[j2])
			{
				System.out.print(a1[j1]+" ");
				j1++;
				j2++;
			}
			else if(a1[j1]<a2[j2])
			{
				j1++;
			}
			else
			{
				j2++;
			}
		}
	}

}
=======
package com.learning.core.day3;

import java.util.Scanner;

public class D03P14 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in array1");
		int n1=sc.nextInt();
		
		int[] a1=new int[n1];
		
		System.out.println("Enter sorted array1");
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter number of elements in array2");
		int n2=sc.nextInt();
		
		int[] a2=new int[n2];
		
		System.out.println("Enter sorted array2");
		for(int j=0;j<n2;j++)
		{
			a2[j]=sc.nextInt();
		}
//		int[] u=new int[n1+n2];
//		int[] i=new int[n1+n2];
//		for(int k=0;k<n1;k++)
//		{
//			for(int l=0;l<n2;l++)
//			{
//				
//			}
//		}
		int i1=0,i2=0;
		System.out.print("Union : ");
		while(i1<n1 && i2<n2)
		{
			if(a1[i1]<a2[i2])
			{
				System.out.print(a1[i1]+" ");
				i1++;
			}
			else if(a1[i1]>a2[i2])
			{
				System.out.print(a2[i2]+" ");
				i2++;
			}
			else if(a1[i1]==a2[i2])
			{
				System.out.print(a1[i1]+" ");
				i1++;
				i2++;
			}
		}
		while(i1<n1)
		{
			System.out.print(a1[i1]+" ");
			i1++;
		}
		while(i2<n2)
		{
			System.out.print(a2[i2]+" ");
			i2++;
		}
		
		int j1=0,j2=0;
		System.out.print("\n Intersection : ");
		while(j1<n1 && j2<n2)
		{
			if(a1[j1]==a2[j2])
			{
				System.out.print(a1[j1]+" ");
				j1++;
				j2++;
			}
			else if(a1[j1]<a2[j2])
			{
				j1++;
			}
			else
			{
				j2++;
			}
		}
	}

}
>>>>>>> 2fe23d38fc0011e70d3e80d5a62599f49f5284b5
