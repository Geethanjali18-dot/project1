package assesment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=1;
		int k=0;
		int sum=0;
		System.out.println(i);
		System.out.println(j);
		while(k<=10)
		{
			sum=i+j;
			System.out.println(sum);
			i=j;
			j=sum;
			k++;
		}
		
		
	}
}
