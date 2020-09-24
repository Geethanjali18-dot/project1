package demo5;

import java.util.Scanner;

/*
 * 153 - > 1 5 3
 * 1*1*1   5*5*5 3*3*3
 * 1+125+27=153
 */
public class ArmstrongNumber {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=n;
	int digit=0,temp=0;
	while(n>0)
	{
		digit=n%10;
		temp=temp+digit*digit*digit;
		n=n/10;
	}
	if(m==temp)
		System.out.println("Armstrong Number");
	else
		System.out.println("Not Armstrong Number");
		
}
}
