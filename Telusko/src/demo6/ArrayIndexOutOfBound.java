package demo6;

import java.nio.channels.AlreadyBoundException;
import java.util.Random;

public class ArrayIndexOutOfBound {
public static void main(String[] args) {
	Random r=new Random();
	int a[]=new int[50];
	for(int i=0;i<a.length;i++)
	{
		a[i]=r.nextInt(50);
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	//enhanced for loop
	for(int i:a)
	{
		System.out.println(i);
	}
	
	try
	{
		System.out.println(a[52]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println("Maximun index is 49");
	}
}
}
