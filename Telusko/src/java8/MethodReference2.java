package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser
{
	String parse(String str);
}
class StringParser
{
	//instant
	//public  String convert(String s)
	public static String convert(String s)
	{
		
		if(s.length()<=3)
			s=s.toUpperCase();
		else
			s=s.toLowerCase();
		return s;
	}
}
class MyPrinter
{
	public void print(String str,Parser p)
	{
		str=p.parse(str);
		System.out.println(str);
	}
}
public class MethodReference2 {
public static void main(String[] args) {
	List<String>names=Arrays.asList("Geetha","Seetha","Reena");
	//instant
	//create object
	//StringParser sp=new StringParser();
	
	String str="Anjali";
	MyPrinter mp=new MyPrinter();
	mp.print(str,(StringParser::convert));
	//instant
	//mp.print(str,(sp::convert));
	
}
}
