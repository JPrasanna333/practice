package practice;

import java.util.*;
class Temp
{
	public String toString()
	{
		
		return "temp";
	}
	public void finalize()
	{
		System.out.println("finalize method called");
	}
}

public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WeakHashMap h=new  WeakHashMap();
		Temp t=new Temp();
		h.put(t, "hello");
		System.out.println(h);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(h);

	}

}
