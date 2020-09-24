package demo5;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	int k,a=0,b=1;
	k=0;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	System.out.println(a);
	System.out.println(b);
	while(k<=n)
	{
		k=a+b;
		System.out.println(k);
		a=b;
		b=k;
	}
}
}
