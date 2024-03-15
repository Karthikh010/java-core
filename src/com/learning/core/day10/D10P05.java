package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class D10P05 {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			String s = sc.next();
			
			File f  = new File("io.txt");
			f.createNewFile();
			
			FileWriter fw = new FileWriter(f);
			fw.write(s);
			fw.flush();
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			
			String fl = br.readLine();
			
			
			System.out.println("Size of the file is "+fl.length());
			System.out.println("Content of the file : "+fl);
			
			f.delete();
			fw.close();
			fr.close();
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
