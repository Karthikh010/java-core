package com.learning.core.day4;

public class Validator 
{
	int valid=0;
	boolean isValidApplicantName(String name)
	{
		if(name.equals(null)|| name.equals(""))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	boolean isValidPost(String post)
	{
		if(post.equals("Probationary Officer")||post.equals("Assistant")||post.equals("Special Cadre Officer"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isValidAge(int age)
	{
		if(age>18 && age<30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void validate(Applicant applicant) throws CatheyBankException
	{
		if(isValidApplicantName(applicant.applicatnName))
		{
			valid++;
		}
		else
		{
			throw new CatheyBankException("Invalid Applicant Name");
		}
		if(isValidPost(applicant.postApplied))
		{
			valid++;
		}
		else
		{
			throw new CatheyBankException("Invalid Post");
		}
		if(isValidAge(applicant.applicantAge))
		{
			valid++;
		}
		else
		{
			throw new CatheyBankException("Invalid Age");
		}
		if(valid==3)
		{
			System.out.println("All details are valid");
		}
	}
}
