package com.prasannaj.InterThreadCommunication;

public class UserThread extends Thread {
	int sum=0;
	

	public void run()
	{
		
		synchronized(this)
		{
			for(int i=1;i<=100;i++)
			{
				sum=sum+i;
			}
			//notify();
		}
	}

}
