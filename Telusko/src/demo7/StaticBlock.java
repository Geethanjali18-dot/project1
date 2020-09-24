package demo7;

public class StaticBlock {
	static String s="Hello World";
	static
	{
		System.out.println("Hello World in static");
	}
public static void main(String[] args) {
	System.out.println("Hello World in main");
	System.out.println("The value for s "+s);
}
static
{
	System.out.println("Bye in static 2");
}
}
