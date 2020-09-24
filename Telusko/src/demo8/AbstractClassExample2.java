package demo8;

public class AbstractClassExample2 {
public static void main(String[] args) {
	
	Iphone obj=new Iphone();
	show(obj);
	SamsungS4 obj1=new SamsungS4();
	show(obj1);
}
public static void show(Phone obj)
{
obj.showConfig();	
}
/*
public static void show(Iphone obj)
{
obj.showConfig();	
}
public static void show(SamsungS4 obj)
{
obj.showConfig();	
}*/
}
abstract class Phone
{
	public abstract void showConfig();
	
}

class Iphone extends Phone
{
	public void showConfig()
	{
		System.out.println("2 GB,IOS 9.3");
	}
}
class SamsungS4 extends Phone
{
	public void showConfig()
	{
		System.out.println("2 GB,Lolipop");
	}
}

