package demo8;
//Method overriding
//Late Binding
//Dynamic binding
//Runtime polymorphism
public class PolymorphismMethodOverriding {

	public static void main(String[] args) {
		B4 b=new B4();
		b.show();
		A4 a=new B4();
		a.show();
		//B4 obj=new A4();
		//obj.show();
	}
}

class A4
{
	public void show()
	{
		System.out.println("In show A");
	}
}

class B4 extends A4
{
	public void show()
	{
		System.out.println("In show B");
	}
	
}
