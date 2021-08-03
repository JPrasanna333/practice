package com.prasanna.Exception;

public class A {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;

		try
		{
			sum=-10;
			
			for(i=-1;i<3;i++)
			{
				sum=(sum/i);
				System.out.println(sum);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.print("0");
		}
		System.out.print(sum);
	
	}
	

}
