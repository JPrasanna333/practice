package com.prasanna.practice;

public class LaunchPolymorphism 
{
	public static void main(String args[])
	{
	CargoPlane c=new CargoPlane();
	PassengerPlane p=new PassengerPlane();
	FighterPlane f= new FighterPlane();
	Plane ref;
	ref=c;
	ref.takeOff();
	ref.fly();
	ref.land();
	ref=p;
	ref.takeOff();
	ref.fly();
	ref.land();
	ref=f;
	ref.takeOff();
	ref.fly();
	ref.land();
	}
	

}
