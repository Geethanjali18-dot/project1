package demo5;

public class SwappingNumbersEasyWay {
public static void main(String[] args) {
	//way 4
		int a=4;
		int b=5;
		b=a+b-(a=b);
		
		System.out.println("after swapping");
		System.out.println("a "+a);
		System.out.println("b "+b);
}
}
