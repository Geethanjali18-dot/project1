package demo8;

public class ThisKeyword {

	public static void main(String[] args) {
		A9 obj=new A9(7);
		obj.show();
	}
}

class A9
{
	private int x;//instance variable
	public A9(int x)//a local variable
	{
		this.x=x;//current instance
	}
	public void show()
	{
		System.out.println("x is "+x);
	}
}
