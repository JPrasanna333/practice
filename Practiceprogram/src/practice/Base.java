package practice;

public class Base implements Runnable{
	public void run() 
	{
		System.out.println("a1");
		try
		{
		Thread.sleep(3000);
		System.out.println("a2");
		}
		catch(Exception e)
		{
			
		}
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  Base b=new Base();
		  Thread t=new Thread(b);
		  t.start();
		 
	    // new Thread(new Base()).start();
	     System.out.println("m1 ");
	     
	     System.out.println("m2 ");
	     
		
		

	}

}
