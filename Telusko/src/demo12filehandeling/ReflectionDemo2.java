package demo12filehandeling;

class B
{
	
}
class A extends B
{
	
}
/*interface A
{
	
}*/
public class ReflectionDemo2 {
public static void main(String[] args) throws ClassNotFoundException {
Class c=Class.forName("demo12filehandeling.A");
System.out.println(c.isInterface());
System.out.println(c.getSuperclass());

}
}
