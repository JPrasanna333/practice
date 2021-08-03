package com.prasanna.practice;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee emp =new Employee();
		Laptop lap =new Laptop("Acer","i5 processor","8gb RAM");
		Bag b =new Bag("acerbag",1000);
		System.out.println(emp.acc.getAccount_no());
		System.out.println(emp.acc.getSalary_no());
		System.out.println(emp.acc.getBasic_salary());
		System.out.println(emp.r.getDesignation());
		System.out.println(emp.r.getManager());
		emp.hasLaptop(lap);
		emp.hasBag(b);
		
		
		
		

	}

}
