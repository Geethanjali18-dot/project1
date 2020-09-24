package demo5;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean b=isPerfect(n);
	if(b)
	{
		System.out.println("Perfect number");
	}
	else
	{
		System.out.println("Not Perfect number");
	}
	
}
public static boolean isPerfect(int n)
{
	int sum=0;
	for(int i=1;i<n/2;i++)
	{
		if(n%i==0)
		{
			sum+=i;
		}
	}
	if(n==sum)
		return true;
	
	return false;
	
}
}
