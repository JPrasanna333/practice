package com.prasanna.Multithreading;

public class LaunchThreadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("mainthread");
		System.out.println(Thread.currentThread().getName());
		ThreadName t1= new ThreadName();
		ThreadName t2= new ThreadName();
		ThreadName t3= new ThreadName();
		t1.start();
		t2.start();
		t3.start(); 
		
	}
}
