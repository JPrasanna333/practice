package com.prasanna.Multithreading;

public class MultiThreadingDemo extends Thread {
	public void run()
	{
		Thread t= Thread.currentThread();
		String name=t.getName();
		if(name.equals("SPELL CHECK"))
		{
			spellCheck();
		}
		else if(name.equals("AUTOSAVING"))
		{
			autosaving();
		  
		}
		else
		{
			typing();	
			
		}
	}
		public void spellCheck()
		{
			try
			{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(3000);
			   System.out.println("spellchecking.....");
			}
			}
			catch(Exception e)
			{
				System.out.println("spellcheck interrupted");
			}
		}
		public void autosaving() {
			try
			{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(3000);
			   System.out.println("autosaving.....");
			   
			}
			}
			catch(Exception e)
			{
				System.out.println("autosaving is interrupted");
			}
			
		}
		public void typing()
		{
			try
			{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(3000);
			   System.out.println("typing.....");
			}
			}
			catch(Exception e)
			{
				System.out.println("typing is interrupted");
			}
			
		}
		
	
	
	

}
