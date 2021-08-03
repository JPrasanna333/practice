package practice;

import java.util.Hashtable;

public class C {
	public static void main(String...a)
	{
		Hashtable h=new Hashtable(30);
		h.put(new Test(4),"A");
		h.put(new Test(1),"B");
		h.put(new Test(6),"C");
		h.put(new Test(15),"D");
		h.put(new Test(20),"E");
		h.put(new Test(29),"E");
		h.put(new Test(27),"E");
		System.out.println(h);
	}

}
class Test
{
	int i;
	Test(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return 10;
	}
	public String toString()
	{
		return i+" ";
	}
}
