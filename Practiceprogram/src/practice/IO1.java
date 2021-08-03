package practice;
import java.io.*;


public class IO1 {

	public static void main(String[] args) 
	{
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			// TODO Auto-generated method stub
			fr=new FileReader("C:\\eg\\IO.txt");
			br=new BufferedReader(fr);
			String str;
			while((str= br.readLine())!= null)
			{
				System.out.println(str);
			}

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}

		}
	}

}
