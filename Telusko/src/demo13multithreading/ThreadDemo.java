package demo13multithreading;
class Hi extends Thread
{
	//overriding run method
	public void run()
	
{
		for (int i=1;i<=5;i++)
	{
		System.out.println("Hi");
		try {Thread.sleep(1000);} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
}
class Hello extends Thread
{
	//overriding run method
	public void run()
	
	{
	for (int i=1;i<=5;i++)
	{
		System.out.println("Hello");
		try {Thread.sleep(1000);} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
public class ThreadDemo {
public static void main(String[] args) {
	System.out.println("Good");
	Hi obj1=new Hi();
	Hello obj2=new Hello();
	
	obj1.start();//internally calls run method by default
	try {Thread.sleep(1000);} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	obj2.start();//internally calls run method by default
	
	
}
}
