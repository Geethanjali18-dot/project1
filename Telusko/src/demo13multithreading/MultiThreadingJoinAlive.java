package demo13multithreading;
//Anonymus class
public class MultiThreadingJoinAlive {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Good");
	
	
	
	Thread t1=new Thread(()->
			{
		
		for (int i=1;i<=5;i++)
	{
		System.out.println("Hi");
		try {Thread.sleep(1000);} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	});
	t1.start();//internally calls run method by default
	try {Thread.sleep(1000);} catch (InterruptedException e) {	}
	
	Thread t2=new Thread(()->
{
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	});
	t2.start();//internally calls run method by default
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	t2.isAlive();
	t1.join();//makes main thread to wait
	t2.join();
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println("Bye");
}
}
