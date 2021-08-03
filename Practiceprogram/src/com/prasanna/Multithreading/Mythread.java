package com.prasanna.Multithreading;

public class Mythread extends Thread {
	
	public Mythread (String name)
	{
		this.setName(name);
	}
	@Override
	public void run() 
	{
		try 

		{ 
			sleep(100);
		} 
		catch (InterruptedException e) 

		{ 
			System.out.println(e);
		} 
		play(); 

	} 
	private void play()
	{
		System.out.print(getName());
		System.out.print(getName());
	}
} 


