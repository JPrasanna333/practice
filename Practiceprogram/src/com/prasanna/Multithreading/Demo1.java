package com.prasanna.Multithreading;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new ArithmeticException();
		}
		catch( ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
