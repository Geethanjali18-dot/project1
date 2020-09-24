package demo5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		//for(int i=2;i<Math.sqrt(n);i++)
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(n+" "+"is a prime number");
		}
		else
		{
			System.out.println(n+" "+"is not a prime number");
		}
	}
}
