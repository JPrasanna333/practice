package practice;

import java.util.Scanner;

public class RoadSignaling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the color");
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		str=str.toLowerCase();
		if(str.equals("red"))
		{
			System.out.println("stop");
		}
		else if(str.equals("green"))
		{
			System.out.println("go");
		}
		else if(str.equals("yellow"))
		{
			System.out.println("proceed with caution");
		}
		else 
		{
			System.out.println("prepare to go");
		}
		kb.close();
		

	}

}
