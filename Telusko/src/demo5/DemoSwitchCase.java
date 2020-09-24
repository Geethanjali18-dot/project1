package demo5;

public class DemoSwitchCase {
public static void main(String[] args) {
	int i=10;
	
	switch(i)
	{
	case 0:
		System.out.println("Zero");
		break;
	case 1:
		System.out.println("One");
		break;
	case 7:
		System.out.println("Seven");
		break;
	case 9:
		System.out.println("Nine");
		break;
	default:
		System.out.println("irrelevant number");
			
	}
		
	String s="Hi";
			switch(s)
			{
			case "Hi":
				System.out.println("Hi");
				break;
			case "Hello":
				System.out.println("Hello");
				break;
			default:
				System.out.println("Invalid");
			}
			
	
	
}
}
