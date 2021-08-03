package com.prasannaj.Collection;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(20);
		//System.out.println(a);
	//	a.add(2, 25);
		System.out.println(a.size());
		ArrayList<Integer> b = new ArrayList<Integer>();
		System.out.println(b.addAll(a));// returns boolean b.add(60);
		System.out.println(b); // b.addAll(2,a); //System.out.println(b);
		System.out.println(b.contains(50));
		System.out.println(a.containsAll(b));// false
		System.out.println(b.indexOf(25));// returns -1 if the element is not present
		System.out.println(b.lastIndexOf(20));// 6 System.out.println(b.get(4));//40
		System.out.println(b.getClass());
		System.out.println(b.isEmpty());// false
		System.out.println(a.equals(b));// false a.clear(); a.add(5); a.add(78);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.retainAll(b));
System.out.println("++");
		b.retainAll(a);
		System.out.println(a);

		a.retainAll(b); 
		System.out.println(b); 
		System.out.println(a);

		/*
		 * LinkedList e = new LinkedList(); e.add(20); e.add(30); e.add(40); e.push(45);
		 * e.pop(); System.out.println(e); }
		 * 
		 * 
		 * TreeSet h=new TreeSet(); h.add(13); h.add(4); h.add(3);
		 * System.out.println(h.add(13)); System.out.println(h);
		 */
		/*
		 * LinkedList ll = new LinkedList(); ll.add(100); ll.add(25); ll.add(30);
		 * ll.add(75); ll.add(100); ll.add(150); System.out.println(ll); }
		 */
		/*
		 * LinkedList ll = new LinkedList(); ll.add(100); ll.add(25); ll.add(30);
		 * ll.add(75); ll.add(100); ll.add(150); Iterator l = ll.element();
		 * while(l.hasNext()==true) { System.out.print(l.next()); }
		 */
		/*
		 * HashSet ll = new HashSet(); ll.add(100); ll.add(25); ll.add(30); ll.add(75);
		 * ll.add(100); ll.add(150); Iterator itr = ll.iterator();
		 * while(itr.hasNext()==true) { System.out.print(itr.next()); }
		 */
		/*
		 * TreeSet ll = new TreeSet(); ll.add(100); ll.add(25); ll.add(30); ll.add(75);
		 * ll.add(100); ll.add(150); Iterator itr = ll.iterator();
		 * while(itr.hasNext()==true) { System.out.print(itr.next()); }
		 */
		/*
		 * LinkedHashSet ll = new LinkedHashSet(); ll.add(100); ll.add(25); ll.add(30);
		 * ll.add(75); ll.add(100); ll.add(150); Iterator itr = ll.iterator();
		 * while(itr.hasNext()==true) { System.out.print(itr.next()); }
		 */
		/*
		 * LinkedList ll = new LinkedList(); ll.add(100); ll.add(25); ll.add(30);
		 * ll.add(75); ll.add(100); ll.add(150); Iterator itr = ll.iterator();
		 * while(itr.hasNext()==true) { System.out.print(itr.next()); }
		 */
		/*
		 * HashSet hs = new HashSet(); hs.add(100); hs.add(25); hs.add(50); hs.add(150);
		 * hs.add(200); System.out.println(hs.tail);
		 */
		/*
		 * TreeSet hs = new TreeSet(); hs.add(100); hs.add(25); hs.add(50); hs.add(150);
		 * hs.add(200); System.out.print(hs.tailSet(75));
		 * System.out.print(hs.floor(20));
		 */
		TreeSet hs = new TreeSet();
		hs.add(10);
		hs.add("20");
		Iterator itr = hs.iterator();
		  while(itr.hasNext()==true) { System.out.print(itr.next()); 
		  }
		  }
}
		
		
	

