package demo5;

public class SwapNumbers {
public static void main(String[] args) {
	//way 1 using 3rd variable
	int a=4;
	int b=5;
	int temp=0;
	temp=a;
	a=b;
	b=temp;
	System.out.println("way1");
	System.out.println("a "+a);
	System.out.println("b "+b);
	
	//way2  without using 3rd variable
	a=6;
	b=7;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("way2");
	System.out.println("a "+a);
	System.out.println("b "+b);
	
	//way3 using XOR
		a=3;
		b=9;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("way3");
		System.out.println("a "+a);
		System.out.println("b "+b);
	
}
}
