package demo9;

import java.io.IOException;

public class UserInput {
public static void main(String[] args) throws IOException {
	//Scanner
	//BufferedReader
	//printf() cout Console.WriteLine();
	//c scanf
	//c++ cin
	//c# Console.ReadLine();
	System.out.println();//to print
	int i=System.in.read();//to read
	System.out.println(i);//prints ASCII value
	System.out.println((char)i);
	String str="";
	while((i=System.in.read())!=48)
	{
		str=str+(char)i;
	}
	System.out.println(str);
	
}
}
