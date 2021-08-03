package com.prasanna.Exception;

import java.util.Scanner;

public class Demo1 {
	public void alpha() 
	{

		System.out.println("alpha method");
		System.out.println("enter the numeretor");
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		System.out.println("enter the denominator");
		int b=kb.nextInt();
		int c=a/b;
		System.out.println(c);	
	}
}
