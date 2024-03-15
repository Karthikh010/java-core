package com.learning.core.day10;

import java.io.*;

public class D10P04 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader fr = new FileReader("source.txt");
			FileWriter fw = new FileWriter("D10P04.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			int c;
			while((c=fr.read())!= -1)
			{
				//bw.newLine();
				bw.write(c);
				bw.flush();
			}
			System.out.println("Copied.");
			fr.close();
			fw.close();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
