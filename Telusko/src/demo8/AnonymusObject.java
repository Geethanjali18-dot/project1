package demo8;

public class AnonymusObject {
public static void main(String[] args) {
	//when we want to use multiple times
	//A10 a=new A10();
	//a.show();
	//when we want to use only one time anonymus object
	new A10().show();
}
}

class A10
{
	public void show()
	{
		System.out.println("Hi");
	}
}
