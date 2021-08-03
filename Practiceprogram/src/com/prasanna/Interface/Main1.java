package com.prasanna.Interface;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Itr i=
				()->
		{ System.out.println("method");
		}; //lambda expressions in functional interface
		i.add();
		i.add();

	}

}
