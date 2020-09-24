package demo9;

import java.util.Scanner;

/*
 * Find out the length of both the strings
 * concatenation of two strings
 * convert first string into upper case
 */
public class StringOperations {
public static void main(String[] args) {
	String s1,s2;
	System.out.println("Enter string 1");
	Scanner sc=new Scanner(System.in);
	s1=sc.nextLine();
	System.out.println("Enter string 2");
	s2=sc.nextLine();
	//way 1 concat
	String s3=s1.concat(s2);
	System.out.println("Concat result "+s3);
	//way 2 concat
	String s4=s1+s2;
	System.out.println("Concat result "+s4);
	
	int l1=s1.length();
	int l2=s2.length();
	System.out.println("length of s1 "+l1);
	System.out.println("length of s2 "+l2);
	
	
	String s5=s1.toUpperCase();
	String s6=s2.toUpperCase();
	System.out.println(s5+" "+s6);
	
	
}
}
