package demo6;

public class Array {
public static void main(String[] args) {
	int a[]=new int[5];
	/*a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	*/
	for(int i=0;i<5;i++)
	{
		a[i]=i+1;
	}
	System.out.println(a);
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
}
}
