package demo5;

public class DemoTernaryOperator {
public static void main(String[] args) {
	int i=1;
	int j=5;
	/*if(i==1)
		j=6;
	else
		j=7;
		*/
	j=i==1?6:7;
	System.out.println(j);
	
	
	Object obj1;
	Object obj2;
	if(true)
	{
		obj1=new Integer(10);
	}
	else
	{
		obj1=new Double(15.0);
	}
	System.out.println(obj1);
	
	obj2=true?new Integer(10):new Double(15.0);
	System.out.println(obj2);
}

}
