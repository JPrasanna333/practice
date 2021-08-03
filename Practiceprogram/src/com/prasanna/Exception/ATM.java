package com.prasanna.Exception;

import java.util.Scanner;

public class ATM {
	private int acc_no=9999;
	private int password=9999;
	int acc,pwd;
	public void acceptInput() 
	{
		try
		{
			Scanner kb=new Scanner(System.in);
			System.out.println("enter the account no");
			acc=kb.nextInt();
			System.out.println("enter the password");
			pwd=kb.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public void verify() throws InvalidInputException
	{
		if(acc==acc_no && pwd== password)
		{
			System.out.println("collect your money");

		}
		else
		{
			/*
			 * InvalidInputException e =new InvalidInputException();
			 * System.out.println(e.getMessage());
			 */ 
			throw new InvalidInputException();
		}
	}


}
