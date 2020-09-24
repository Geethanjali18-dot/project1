package demo8;

public class DynamicDispatch {
public static void main(String[] args) {
	B5 b=new B5();
	b.show();
	A5 obj=new A5();
	A5 a=obj;
	a.show();
	//A5 a1=new B5();
	//a1.show();
}
}

class A5
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class B5
{
	public void show()
	{
		System.out.println("In show B");
	}
}
