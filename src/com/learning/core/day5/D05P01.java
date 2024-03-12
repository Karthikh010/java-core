package com.learning.core.day5;

import java.util.Scanner;

public class D05P01 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Employee or 2 for Student:");
        int user = scanner.nextInt();

        if (user == 1) 
        {
        	System.out.println("Enter 1 if the Employee has a Passport \n2 -> PAN Card \n3-> Voter ID: ");
        	int pas=scanner.nextInt();
        	if(pas==1)
        	{
	            System.out.println("Enter Employee details:");
	            String name = scanner.next();
	            long phoneNo = scanner.nextLong();
	            int employeeId = scanner.nextInt();
	            String passportNo = scanner.next();
	
	            Employee emp = new Employee(name, phoneNo, employeeId, passportNo);
	            
	            Register<Employee> e = new Register<>();
	            e.generateRegisterId(7);
	            e.getRegisterID(emp);
        	}
        	else if(pas==2)
        	{
        		System.out.println("Enter Employee details:");
	            String name = scanner.next();
	            long phoneNo = scanner.nextLong();
	            int employeeId = scanner.nextInt();
	            String panCardNo = scanner.next();
	            int licenseNo = scanner.nextInt();
	
	            Employee emp = new Employee(name, phoneNo, employeeId, licenseNo,panCardNo);
	            
	            Register<Employee> e = new Register<>();
	            e.generateRegisterId(7);
	            e.getRegisterID(emp);
        	}
        	else if(pas==3)
        	{
        		System.out.println("Enter Employee details:");
	            String name = scanner.next();
	            long phoneNo = scanner.nextLong();
	            int employeeId = scanner.nextInt();
	            int voterId = scanner.nextInt();
	            int licenseNo = scanner.nextInt();
	
	            Employee emp = new Employee(name, phoneNo, employeeId,voterId, licenseNo);
	            
	            Register<Employee> e = new Register<>();
	            e.generateRegisterId(7);
	            e.getRegisterID(emp);
        	}
        } 
        else if (user == 2) 
        {
        	System.out.println("Enter 1 if the Student has a Passport \n2 -> PAN Card \n3-> Voter ID: ");
        	int pas=scanner.nextInt();
        	
        	if(pas==1)
        	{
        		System.out.println("Enter Student details:");
                String name = scanner.next();
                long phoneNo = scanner.nextLong();
                String passportNo = scanner.next();

                Student s = new Student(name, phoneNo, passportNo);

                Register<Student> std = new Register<>();
                std.generateRegisterId(7);
                std.getRegisterID(s);
        	}
        	else if(pas==2)
        	{
        		System.out.println("Enter Student details:");
                String name = scanner.next();
                long phoneNo = scanner.nextLong();
                int licenseNo = scanner.nextInt();
                String panCardNo = scanner.next();

                Student s = new Student(name, phoneNo, licenseNo, panCardNo);

                Register<Student> std = new Register<>();
                std.generateRegisterId(7);
                std.getRegisterID(s);
        	}
        	else if(pas ==3)
        	{
        		System.out.println("Enter Student details:");
                String name = scanner.next();
                long phoneNo = scanner.nextLong();
                int voterId = scanner.nextInt();
                int licenseNo = scanner.nextInt();

                Student s = new Student(name, phoneNo, voterId, licenseNo);

                Register<Student> std = new Register<>();
                std.generateRegisterId(7);
                std.getRegisterID(s);
        	}
        }
	}

}
