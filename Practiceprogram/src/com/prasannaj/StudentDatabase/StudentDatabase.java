package com.prasannaj.StudentDatabase;

import java.util.*;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the number of students");
		int n=kb.nextInt();
		System.out.println("enter the student id, student name and phone no");

		ArrayList al=new ArrayList();
		while(n!=0)
		{
			for(int i=0;i<3;i++)
		{
			al.add(kb.next());
			
		}
			n--;
		}
		
	
}
}