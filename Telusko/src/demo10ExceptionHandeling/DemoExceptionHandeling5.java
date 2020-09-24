package demo10ExceptionHandeling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//pending
public class DemoExceptionHandeling5 {
public static void main(String[] args) throws IOException {
	int i,j,k=0;
	i=5;
	//j=2;
	j=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	
	
	try
	{
		j=Integer.parseInt(br.readLine());
		k=i+j;
		if(k<10)
		{
			throw new ArithmeticException();
		}
		System.out.println("k ="+k);
	}
	
	catch(IOException e)
	{
		System.out.println("IO error");
	}
	//unchecked exception
	
	catch(ArithmeticException e)
	{
		System.out.println("Minimum value for output is 10");
	}
	
	catch(Exception e)
	{
		System.out.println("Unknown Exception");
	}
	
	finally
	{
		br.close();
		System.out.println("bye");
	}
}
}
