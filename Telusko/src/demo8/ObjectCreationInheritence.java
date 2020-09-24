package demo8;
//constructor super
public class ObjectCreationInheritence {
public static void main(String[] args) {
	A2 obj1=new A2();
	A2 obj2=new A2(5);
	B2 obj3=new B2();
	B2 obj4=new B2(5);
	A2 obj5=new B2();
	
			
}
}

class A2
{
	public A2()
	{
		//super(); //object class
		System.out.println("in A constructor ");
		
	}
	public A2(int i)
	{
		System.out.println("in A constructor int ");
		
	}
	
}

class B2 extends A2
{
	
	public B2()
	{
		super();
		System.out.println("in B constructor ");
		
	}
	public B2(int i)
	{
		System.out.println("in B constructor int ");
		
	}
}