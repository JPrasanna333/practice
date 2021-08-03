package com.prasanna.practice;

public class Employee {
	
	SalaryAccount acc=new SalaryAccount(101,15,25000);
	Role r= new Role("Project Manager","Mr.James");
	public void hasLaptop(Laptop lap)
	{
		System.out.println(lap.getBrand());
		System.out.println(lap.getProcessor());
		System.out.println(lap.getMemory());
	}
	public void hasBag(Bag b)
	{
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		
	}
	
	

}
