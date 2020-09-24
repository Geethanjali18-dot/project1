package demo8;

public class SuperDemo {
public static void main(String[] args) {
	A6 obj=new A6();
	B6 obj1=new B6();
	B6 obj2=new B6(5);
	
}
}

class A6 extends Object
{

	public A6()
	{
		super();//object class
		System.out.println("In constructor A");
	}
	public A6(int i)
	{
		super();//object class	
		System.out.println("In constructor A para");
	}
	
}

class B6 extends A6
{
	public B6()
{
		super();
	System.out.println("In constructor B");
}
	public B6(int i)
	{
		super(i);
		System.out.println("In constructor B para");
	}
}
