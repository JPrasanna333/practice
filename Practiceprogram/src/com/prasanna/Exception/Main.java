package com.prasanna.Exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		try 
		{
			 int sum = 10;
			for (i = 1; i < 3 ;++i)
			{
				sum = (sum / i);
			     System.out.print(sum);
			}

		}
		catch(ArithmeticException e) 
		{
			System.out.print("0");  
		
		} 
	}

}
