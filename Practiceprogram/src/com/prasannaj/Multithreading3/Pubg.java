package com.prasannaj.Multithreading3;

public class Pubg implements Runnable {
	String res1=new String("AK47");
	String res2=new String("M416");
	String res3=new String("shortgun");
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(name.equals("Player 1"))
		{
			player1Res();
		}
		else
		{
			player2Res();
		}
			
	}
	public void player1Res()
	{
		synchronized (res1)
		{
			try {
				System.out.println("Player 1 is using "+res1);
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		synchronized (res2)
		{
			try {
				System.out.println("Player 1 is using "+res2);
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		synchronized (res3)
		{
			try {
				System.out.println("Player 1 is using "+res3);
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
				}
			
		}
		public void player2Res() 
		{

			synchronized (res1)
			{
				try {
					System.out.println("Player 2 is using "+res1);
					Thread.sleep(3000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			synchronized (res2)
			{
				try {
					System.out.println("Player 2 is using "+res2);
					Thread.sleep(3000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			synchronized (res3)
			{
				try {
					System.out.println("Player 2 is using "+res3);
					Thread.sleep(3000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
					}	
	}
	
	

}
