
package demo15InnerClass;


public class NestedInnerClass {
public static void main(String[] args) {
	A1 a=new A1();
	A1.B obj=new A1.B();
	obj.show();
}
}
class A1
{
	int rollno;
	String name;
	 
	static class B
	{
		public void show()
		{
			System.out.println("Hello");
		}
	}
}
 