package com.prasanna.Multithreading;

import java.util.Scanner;

public class B implements Runnable {
	public void run()
	{
		try
		{
			System.out.println("number activity started");
			
			Scanner kb=new Scanner(System.in);
			System.out.println("ENTER THE ist NUMBER");
			int first=kb.nextInt();
			Thread.sleep(5000);
		}
			catch(Exception e) {
				System.out.println("exception caught");
			}
			
		}
	}


