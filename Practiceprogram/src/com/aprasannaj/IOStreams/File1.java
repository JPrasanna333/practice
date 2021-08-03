package com.aprasannaj.IOStreams;
import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("C:\\FileDemo\\jp1.txt"));
		PrintWriter pw=new PrintWriter("C:\\FileDemo\\jp2.txt");
		String temp;
		while((temp=br.readLine())!=null)
		{
			pw.write(temp);
		} 
	   br.close();
	   pw.close();
		

	}

}
