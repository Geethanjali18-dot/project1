package demo7;
//To count the number of objects
public class CountingNumberOfObjectsOfClass {
	static int i;//counter //class variable does not depend on object
	public CountingNumberOfObjectsOfClass()
	{
		i++;
	}
	public void counter()
	{
		System.out.println("counter "+i);
	}
public static void main(String[] args) {
	
	CountingNumberOfObjectsOfClass o=new CountingNumberOfObjectsOfClass();
	CountingNumberOfObjectsOfClass o1=new CountingNumberOfObjectsOfClass();
	o.counter();
	//or o1.counter();
	
}
}
