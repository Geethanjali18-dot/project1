package demo9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputBufferedReader {
public static void main(String[] args) throws NumberFormatException, IOException {
	System.out.println("Enter a number");
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);
	//or in one line
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in);
	//int n=br.readLine(); //gives string
	int n=Integer.parseInt(br.readLine());
	System.out.println(n);
	
	
	
	
}
}
