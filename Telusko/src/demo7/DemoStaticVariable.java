package demo7;
//why non static variables do not work in sttaic method
public class DemoStaticVariable {
	int i=8;
	public static void main(String[] args) {
		//i++;
	}

}


class A1
{
	int num1;
	static int num2;
	public static void increment()
	{
		//num1++;//error can not increment non static member in static method which object to increment obj1 ,obj2 or obj3
	}
}
class Demo
{
	public static void main(String[] args) {
		{
			A1.num2=5;
			A1 obj1=new A1();
			A1 obj2=new A1();
			A1 obj3=new A1();
			A1.increment();
			obj1.num1=2;
			obj2.num1=3;
			obj3.num1=4;
		}
	
}
	
}
