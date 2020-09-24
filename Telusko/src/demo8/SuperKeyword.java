package demo8;

public class SuperKeyword {
public static void main(String[] args) {
	B7 obj=new B7();
	obj.show();
	obj.abc();
}
}

class A7
{
	int i=4;
	public void abc()
	{
	System.out.println("A abc");
	}
}

class B7 extends A7
{
	int i=5;
	public void show()
	{
		System.out.println(i);
		System.out.println(super.i);
	}
	public void abc()
	{
		super.abc();
	System.out.println("B abc");
	}
}