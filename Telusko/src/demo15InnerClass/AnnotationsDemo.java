package demo15InnerClass;

import java.util.ArrayList;
@FunctionalInterface
interface Abc
{
	
	void show();
}
class A2
{
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("A");
	}
}
class B2 extends A2
{
	@Deprecated
	public void show()
	{
		
	}
	@Override
	@SuppressWarnings("unchecked")
	public void showMyDataFromLastYearDatabase()
	{
		ArrayList<Integer> obj1=new ArrayList();
		System.out.println("B");
	}
}
public class AnnotationsDemo {
public static void main(String[] args) {
	B2 obj=new B2();
	obj.showMyDataFromLastYearDatabase();
	//obj.show();
}
}
