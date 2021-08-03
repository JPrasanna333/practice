package com.prasannaj.InterThreadCommunication;

public class Main {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		UserThread t=new UserThread();	
		t.start();
		synchronized(t)
		{
			//t.wait();
			
		}
		System.out.println(t.sum);
		
		

	}

}
