package demo7;

public class ConstructorExample {
public static void main(String[] args) {
	Abc obj=new Abc();//Abc() is constructor
	//obj.Abc() can not call constructor explicitly
	
	
}
}
class Abc
{
	//default constructor
	public Abc()
	{
		System.out.println("In Abc constructor");
		
	}
	
}
