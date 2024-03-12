package com.learning.core.day5;
import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> studentNames = new ArrayList<>();
		System.out.print("Enter the names of the Students: ");
		for(int i=0; i<5; i++)
		{
			String st=sc.nextLine();
			studentNames.add(st);
		}
		System.out.print("---------- \n Enter a name to search: ");
		String search=sc.nextLine();
		
		if (studentNames.contains(search)) 
		{
            System.out.println("Found");
        } 
		else 
		{
            System.out.println("Not Found");
        }

	}

}
