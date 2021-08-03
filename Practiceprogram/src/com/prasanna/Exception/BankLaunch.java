package com.prasanna.Exception;

public class BankLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		try
		{
		b.withDraw();
		}
		catch(InvalidInputException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
