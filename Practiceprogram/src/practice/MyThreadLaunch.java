package practice;

public class MyThreadLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
		{
			System.out.println("233");
		}
	};
	Thread t=new Thread(r);	
		t.start();

	}

}
