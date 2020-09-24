package demo15InnerClass;

public class LambdaExpression {
public static void main(String[] args) {
	
	B1 obj=()->	System.out.println("Hi");
		
	obj.show();
	
			
}
}
//Functional interface
@FunctionalInterface
interface B1//SAM -Single Abstarct Method
{
	 void show();
	
}
