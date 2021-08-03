package com.prasanna.Multithreading1;

public class Hall implements Runnable 
{
	synchronized public void run()
	{
		try
		{
			String name=Thread.currentThread().getName();
			System.out.println(name +" has entered the hall");
			Thread.sleep(3000);
			System.out.println(name +" is  using the hall");
			Thread.sleep(3000);
			System.out.println(name +" has exited the hall");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	
	
	

