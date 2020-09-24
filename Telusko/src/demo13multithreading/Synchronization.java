package demo13multithreading;
class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
	
}
public class Synchronization {
public static void main(String[] args) throws InterruptedException {
	Counter c=new Counter();
	c.increment();
	c.increment();
	Thread t=new Thread(new Runnable() 
			{public void run()
		{
				for(int i=1;i<1000;i++)
				{
					c.increment();
				}
		}
		
			});
	Thread t2=new Thread(new Runnable() 
	{public void run()
{
		for(int i=1;i<1000;i++)
		{
			c.increment();
		}
}

	});
	t.start();//1000
	t2.start();//1000 total t1+t2=2000
	t.join();
	t2.join();
	System.out.println("count"+c.count);
}
}
