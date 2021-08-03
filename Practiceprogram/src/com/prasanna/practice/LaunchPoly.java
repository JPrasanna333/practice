package com.prasanna.practice;

public class LaunchPoly {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Animal a=new Animal();
		Deer d=new Deer();
		Tiger t=new Tiger();
		InZoo z=new InZoo();
		z.permit(a);
		z.permit(d);
		z.permit(t);
		
		

	}

}
