package practice;
import java.util.*;

public class A1 {
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set <Integer>s=new HashSet <>();
		Integer i1=45;
		Integer i2=46;
		s.add(i1);
		s.add(i2);
		//s.add(i2);
		System.out.println(s);
		System.out.println((s.size() + " "));
		
		s.remove(i1);
		System.out.println(s);
		System.out.println(s.size() +" ");
		
		i2=47;
	
		s.remove(i2);
		System.out.println(s);
		System.out.println(s.size()+" ");
		
		
	}
}
	
		
		


