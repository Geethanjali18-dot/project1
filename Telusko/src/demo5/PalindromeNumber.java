package demo5;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=n;
	int digit=0,reverse=0;
	while(n>0)
	{
		digit=n%10;
		n=n/10;
		reverse=reverse*10+digit;
		
	}
	if(m==reverse)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
}
}
