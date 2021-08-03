
import java.util.*;

//import java.util.concurrent.CopyOnWriteArrayList;
public class AD  {
	/*
	 * public static void main(String[] args) { CopyOnWriteArrayList al=new
	 * CopyOnWriteArrayList(); al.add(170); al.add(65); al.add(200); al.add(180);
	 * al.add(220); Iterator itr = al.iterator(); while(itr.hasNext()==true) {
	 * itr.next(); al.remove(0); } Collections.sort(al); System.out.println(al); }
	 */
	/*
	 * public static void main(String[] args) { CopyOnWriteArrayList al=new
	 * CopyOnWriteArrayList(); al.add(170); al.add(65); al.add(200); al.add(180);
	 * al.add(220); Iterator itr = al.iterator(); while(itr.hasNext()==true) {
	 * itr.next(); System.out.println(al.remove(2)); } }
	 */
	/*
	 * public static void main(String[] args) { CopyOnWriteArrayList al=new
	 * CopyOnWriteArrayList(); al.add(170); al.add(65); al.add(200); al.add(180);
	 * al.add(220); Iterator itr = al.iterator(); while(itr.hasNext()==true) {
	 * itr.next(); } System.out.println(al); }
	 * ststic int x=;
	 * 
	 */
	public static void main(String[] args)
	{
		Cric c1=new Cric(123);
		Cric c2=new Cric(256);
		LinkedList ll=new LinkedList();
		ll.add(c1);
		ll.add(c2);
		Collections.sort(ll);
		System.out.println(ll);
				
	}
}
