package demo13multithreading;
class Hi1 implements Runnable
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
class Hello1 implements Runnable
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
public class RunnableInterfaceDemo {
public static void main(String[] args) {
	System.out.println("Good");
	Runnable obj1=(Runnable) new Hi1();
	Runnable obj2=new Hello1();
	
	Thread t1=new Thread(obj1);
	t1.start();//internally calls run method by default
	try {Thread.sleep(1000);} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	Thread t2=new Thread(obj2);
	t2.start();//internally calls run method by default
	
	
}
}
