package com.prasanna.Abstract;

abstract public class Car {
	public void start() {
		System.out.println("start the car");
	}

	public void stop() {
		System.out.println("stop the car");
	}

	abstract public void accelerate();

	abstract public void drive();

	abstract public void combustion();

}
