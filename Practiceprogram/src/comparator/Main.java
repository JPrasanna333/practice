package comparator;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Prasanna",01,21);
		Student s2=new Student("ganesh",04,20);
		Student s3=new Student("jai",03,19);
		Student s4=new Student("madav",07,21);
		TreeSet<Student> t=new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println(t);
		TreeSet<Student> t1=new TreeSet<Student>(new MyComparator());
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		System.out.println(t1); 
	
		
	}

}
