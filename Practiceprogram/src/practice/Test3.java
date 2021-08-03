package practice;


public class Test3 {

	public static void main(String[] args) {
		
		Test2 a=new Test2();
		a.start();
		synchronized (a) {

			System.out.println("waiting");
			try {
				a.wait();
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println(a.count);
		}

	}

}
