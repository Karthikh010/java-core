<<<<<<< HEAD
package com.learning.core.day3;

import java.util.Scanner;

public class D03P09 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.print("Enter the strings: ");
        String[] str= new String[n];
        for(int i=0;i<n;i++)
        {
        	str[i]=sc.nextLine();
        }
        for(int j=0;j<n;j++)
        {
        	for(int k=j+1;k<n;k++)
        	{
        		if(str[j].charAt(str[j].length()-1)==str[k].charAt(0))
        		{
        			
        		}
        	}
        }// not finished
	}

}
=======
package com.learning.core.day3;

import java.util.Scanner;

public class D03P09 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.print("Enter the strings: ");
        String[] str= new String[n];
        for(int i=0;i<n;i++)
        {
        	str[i]=sc.nextLine();
        }
        for(int j=0;j<n;j++)
        {
        	for(int k=j+1;k<n;k++)
        	{
        		if(str[j].charAt(str[j].length()-1)==str[k].charAt(0))
        		{
        			
        		}
        	}
        }// not finished
	}

}
>>>>>>> 2fe23d38fc0011e70d3e80d5a62599f49f5284b5
