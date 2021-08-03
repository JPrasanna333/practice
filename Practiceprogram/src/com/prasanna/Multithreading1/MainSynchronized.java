package com.prasanna.Multithreading1;

public class MainSynchronized {

	synchronized public static void main(String[] args) throws  InterruptedException {
		// TODO Auto-generated method stub
		Room r= new Room();
		Hall h=new Hall();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(h);
		Thread t4=new Thread(h);
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("child");
		t4.setName("Others");
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
		//t3.join();
		t4.start();
		//t4.join();
		
	}

}
