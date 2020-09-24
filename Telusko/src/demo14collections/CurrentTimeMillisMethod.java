package demo14collections;

import java.util.ArrayList;

public class CurrentTimeMillisMethod {
public static void main(String[] args) {
	//Total time taken by the method
	long start=System.currentTimeMillis();
	ArrayList<Integer> a=new ArrayList();
	for(int i=1;i<1000000;i++)
	{
		a.add(i);
	}
	long end=System.currentTimeMillis();
	System.out.println(end-start);
	
	long value=System.currentTimeMillis();//milli seconds since from jan 1st 1970
	System.out.println(value);
}
}
