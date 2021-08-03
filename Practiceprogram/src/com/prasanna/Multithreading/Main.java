package com.prasanna.Multithreading;

public class Main  {

	public 
	
	static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultiThreadingDemo d1= new MultiThreadingDemo();
		 MultiThreadingDemo d2= new MultiThreadingDemo();
		 MultiThreadingDemo d3= new MultiThreadingDemo();
		 d1.setName("SPELL CHECK");
		 d2.setName("AUTOSAVING");
		 d3.setName("TYPING");
		 d1.start();
		 d2.start();
		 d3.start();
		 

	}

}
