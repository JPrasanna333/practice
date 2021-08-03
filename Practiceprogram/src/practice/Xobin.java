package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Xobin {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter the first no");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int  a=Integer.parseInt(br.readLine());
		//int a = Integer.parseInt(x);
		System.out.println("enter the second no");
		int b=Integer.parseInt(br.readLine());
		//int b=Integer.parseInt(y);
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
