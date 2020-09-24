package demo10ExceptionHandeling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoExceptionHandeling3 {
public static void main(String[] args) {
	int i,j,k=0;
	i=5;
	//j=2;
	j=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	
	try
	{
		j=Integer.parseInt(br.readLine());
		k=i/j;
	}
	
	catch(IOException e)
	{
		System.out.println("IO error");
	}
	//unchecked exception
	
	catch(ArithmeticException e)
	{
		System.out.println("can not divide by 0");
	}
	
	catch(Exception e)
	{
		System.out.println("Unknown Exception");
	}
	System.out.println(j);
	System.out.println("k ="+k);
}
}
