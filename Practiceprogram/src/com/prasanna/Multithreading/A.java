package com.prasanna.Multithreading;

import java.util.Scanner;

public class A implements Runnable{
	
		// TODO Auto-generated method stub
	public void run()
	{
		try {
		System.out.println("BANKING ACTIVITY STARTED");
		Scanner kb=new Scanner(System.in);
		System.out.println("ENTER THE ACCOUNT NUMBER");
		int ac=kb.nextInt();
		
		System.out.println("ENTER THE PASSWORD");
		int pwd=kb.nextInt();
		//System.out.println(pwd);
		Thread.sleep(5000);
		System.out.println("BANKING ACTIVITY COMPLETED");
		}
		catch(Exception e)
		{
			System.out.println("exception cauguht");
		}
		

	}
	
	

}
