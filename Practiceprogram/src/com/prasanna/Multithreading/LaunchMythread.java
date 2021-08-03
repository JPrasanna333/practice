package com.prasanna.Multithreading;

public class LaunchMythread {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * System.out.println("default priority of main="+Thread.currentThread().
		 * getPriority()); Thread.currentThread().setPriority(15);//
		 */	
		Mythread tableThread = new Mythread("Table"); 
		Mythread tennisThread = new Mythread("Tennis");
		tableThread.start();
		tennisThread.start();
		}

}
