package demo15InnerClass;




public class MemberInnerClass {
public static void main(String[] args) {
	A a=new A();
	A.B obj=a.new B();
	obj.show();
}
}
class A
{
	int rollno;
	String name;
	 
	class B
	{
		public void show()
		{
			System.out.println("Hello");
		}
	}
}
