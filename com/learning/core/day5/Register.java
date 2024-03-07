package com.learning.core.day5;

import java.util.Random;

public class Register <T>
{
	String registerId;
	
	String generateRegisterId(int n) 
	{
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) 
        {
            char randomChar = (char) (random.nextInt(26) + 'A');
            sb.append(randomChar);
        }

        this.registerId = sb.toString();
        return this.registerId;
    }

    void getRegisterID(T obj) 
    {
        System.out.println(this.registerId); //+ " " + obj.toString()
    }
}
