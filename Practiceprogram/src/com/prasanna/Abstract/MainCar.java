package com.prasanna.Abstract;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti800 m = new Maruti800();
		Innova i = new Innova();
		Ferrari f = new Ferrari();
		CarsShed cs = new CarsShed();
		cs.testRun(m);
		cs.testRun(i);
		cs.testRun(f);

	}

}
