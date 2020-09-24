package demo8;
//Method Overloading 
//Early Binding
//Static Binding
//Compile time polymorphism
public class PolymorphismMethdOverloading {
public static void main(String[] args) {
	A3 obj=new A3();
	obj.show();
	obj.show(5);
	obj.show(5.6);
}
}

class A3
{
	public void show()
	{
		System.out.println("Hello");
	}
	public void show(int i)
	{
		System.out.println("Hello "+i);
	}
	public void show(double d)
	{
		System.out.println("Hello "+d);
	}
}
