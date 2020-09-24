package demo12filehandeling;

class A2
{
	
}
interface B2
{
	
}
public class ReflectionDemo1 {
public static void main(String[] args) throws ClassNotFoundException {
	Class c=Class.forName("demo12filehandeling.A2");
	System.out.println(c.isInterface());
	System.out.println(c.getSuperclass());
	Class c1=Class.forName("demo12filehandeling.B2");
	System.out.println(c1.isInterface());
}
}
