package com.prasannaj.Multithreading3;

public class launchPubg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pubg p=new Pubg();
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t1.setName("Player 1");
		t2.setName("Player 2");
		t1.start();
		t2.start();
		

	}

}
