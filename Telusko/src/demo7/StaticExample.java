package demo7;

public class StaticExample {
public static void main(String[] args) {
	Abcde.show();//static method calling
	Abcde.i=5;
}

}
class Abcde
{
	static int i;
	int j;
	public static void show()
	{
		System.out.println("Hi");
		//System.out.println(j); //can not call non static member in static method
	}
}
