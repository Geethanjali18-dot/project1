package demo10ExceptionHandeling;

public class DemoException {
public static void main(String[] args) {
	int i,j,k=0;
	i=5;
	//j=2;
	j=0;
	try
	{
		k=i/j;
		System.out.println("k ="+k);
	}
	//unchecked exception
	
	catch(Exception e)
	{
		System.out.println("can not divide by 0");
	}
	
}
}
