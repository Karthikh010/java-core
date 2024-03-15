package com.learning.core.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class D10P01 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Source file name: ");
			String s = sc.next();
			System.out.println("Enter Destination file name: ");
			String d = sc.next();
			
			File sf = new File(s);
			File df = new File(d);
			
			if(sf.exists()== false)
			{
				System.out.println("Source file does not exist ");
			}
			if(df.exists()== false)
			{
				df.createNewFile();
				//System.out.println(df.getAbsolutePath());
			}
			System.out.println("Whether you want to overwrite? (Yes/No)");
			String st = sc.next();
			//System.out.println(st);
			if(st.equals("Yes"))
			{
				FileInputStream fis = new FileInputStream(sf);
				FileOutputStream fod = new FileOutputStream(df);
				
				int n;
				while((n=fis.read())!=-1)
				{
					fod.write(n);
					fod.flush();
				}
				fis.close();
				fod.close();
				System.out.println("Successfully copied.");
			}
			else
			{
				System.out.println("Not overwriting.");
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
