package com.prasanna.Multithreading1;

public class Room implements Runnable{
	synchronized public void run()
	{
		String name=Thread.currentThread().getName();
		try
		{
			System.out.println(name +" has entered the room");
			Thread.sleep(3000);
			System.out.println(name +" is  using the room");
			Thread.sleep(3000);
			System.out.println(name +" has exited the room");
		    Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
}
}