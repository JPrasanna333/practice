package com.prasanna.LambdaExpMultithreading;

public class Lambda {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Runnable r =()->
		{ 
			for(int i=0;i<=4;i++)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println("Child Thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}

	}

}
