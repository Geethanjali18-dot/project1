package demo10ExceptionHandeling;

public class DemoExceptionHandeling2 {
public static void main(String[] args) {
	int i,j,k=0;
	i=5;
	//j=2;
	j=0;
	int a[]=new int[4];
	
	try
	{
		//k=i/j;
		//System.out.println("k ="+k);
		for(int c=0;c<=4;c++)
		{
			a[c]=c+1;
		}
		for(int value:a)
		{
			System.out.println(value);
		}
	}
	
	//unchecked exception
	
	catch(ArithmeticException e)
	{
		System.out.println("can not divide by 0");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("maximum number of value is 4");
	}
	
}
}
