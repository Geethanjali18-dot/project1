package demo8;
//Final variable,method,class
public class FinalKeyword {
public static void main(String[] args) {
	final int i;
	i=5;
	//i++; or i=8;
	System.out.println(i);
	//B8 obj=new B8();
	//obj.show();
}
}
final class A8
{
	final public void show()
	{
		System.out.println("In A show");
	
	}
}

//can not extend final class
/*class B8 extends A8
{
	//can not override final method
	/*public void show()
	{
		System.out.println("In B show");
	}*/
//}
