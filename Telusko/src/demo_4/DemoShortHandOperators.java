package demo_4;

public class DemoShortHandOperators {
	public static void main(String[] args) {
		
		int i=5;
		i+=2;//i=i+2 ,short hand operators
		System.out.println(i);
		i-=2;//i=i-2 ,short hand operators
		System.out.println(i);
		i*=2;//i=i*2 ,short hand operators
		System.out.println(i);
		byte b=8;
		//b=b*2.5; //result will be double value
		b*=2.5; // is not same as b=b*2.5
		System.out.println(b);
		
	}

}
