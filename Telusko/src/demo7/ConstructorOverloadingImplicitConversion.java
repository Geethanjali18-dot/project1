package demo7;

public class ConstructorOverloadingImplicitConversion {
public static void main(String[] args) {
	Abcd obj=new Abcd();
	Abcd obj1=new Abcd(5);
	Abcd obj2=new Abcd(5.5);
	//obj.Ab() can not call constructor explicitly
	
}

}
class Abcd
{
	public Abcd()
	{
		System.out.println("In Abcd constructor");
	}
	//Parameterized constructor
	//constructor overloading
	/*public Abcd(int i)
	{
		System.out.println("In Abcd constructor para int");
		
	}*/
	//constructor overloading
	public Abcd(double d)
	{
		System.out.println("In Abcd constructor para double");
	}
	
}
