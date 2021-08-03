package practice;

import java.util.*;

public class G2 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub int a[]= {6,9,8}; List<Integer>l=new
		 * ArrayList<>(); l.add(a[0]); l.add(a[2]); l.set(1, a[1]); l.remove(0);
		 * System.out.println(l);
		 */
		int c=0;
		int a=3;
		while(c++ <3)
		{
			int b=(1 +2 *c) % 3;
			switch(b)
			{
			default:
			case 0: a-=1;break;
			case 1: a+=5;
			}
		}
		System.out.println(a);

	}

}
