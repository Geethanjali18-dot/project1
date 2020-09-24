package demo9;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	System.out.println("Enter the integer");
	int n=sc.nextInt();
	System.out.println("str "+str);
	System.out.println("n "+n);
}
}
