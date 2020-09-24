package demo13multithreading;
//Anonymus class
public class ThreadPriority {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Good");
	
	
	
	Thread t1=new Thread(()->
			{
		
		for (int i=1;i<=5;i++)
	{
		System.out.println("Hi"+Thread.currentThread().getPriority());
		try {Thread.sleep(1000);} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	},"Hi Thread");
	t1.start();//internally calls run method by default
	try {Thread.sleep(1000);} catch (InterruptedException e) {	}
	
	Thread t2=new Thread(()->
{
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("Hello"+Thread.currentThread().getPriority());
			try {Thread.sleep(1000);} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	},"Hello Thread");
	//t1.setName("Hi");
	//t2.setName("Hello");
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	//t1.setPriority(1);
	//t2.setPriority(10);
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	System.out.println(t1.getName());
	System.out.println(t2.getName());
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
