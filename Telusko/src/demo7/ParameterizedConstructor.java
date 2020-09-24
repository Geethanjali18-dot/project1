package demo7;

public class ParameterizedConstructor {
public static void main(String[] args) {
	Ab obj=new Ab();
	Ab obj1=new Ab(5);
	Ab obj2=new Ab(5,5.5);
	//obj.Ab() can not call constructor explicitly
	
}

}
class Ab
{
	public Ab()
	{
		System.out.println("In Ab constructor");
	}
	//Parameterized constructor
	//constructor overloading
	public Ab(int i)
	{
		System.out.println("In Ab constructor para");
		
	}
	//constructor overloading
	public Ab(int i,double d)
	{
		System.out.println("In Ab constructor double");
	}
	
}
