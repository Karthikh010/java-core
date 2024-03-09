package com.learning.com.day1;

interface MedicineInfo 
{
    void displayLabel();
}
class Tablets implements MedicineInfo 
{
    public void displayLabel() 
    {
        System.out.println("Store Tablets in a cool dry place.");
    }
}
class Syrup implements MedicineInfo 
{
    public void displayLabel() 
    {
        System.out.println("Syrup is consumable only on prescription.");
    }
}
class Ointment implements MedicineInfo 
{
    public void displayLabel() 
    {
        System.out.println("Ointment is for external use only.");
    }
}

public class D01P02 
{
	public static void main(String[] args) 
	{
        MedicineInfo medicine1 = new Tablets();
        MedicineInfo medicine2 = new Syrup();
        MedicineInfo medicine3 = new Ointment();

        medicine1.displayLabel(); 
        medicine2.displayLabel(); 
        medicine3.displayLabel(); 
    }
}
