package demo6;

import java.util.Random;

public class EnhancedForLoop2 {
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
}
}
