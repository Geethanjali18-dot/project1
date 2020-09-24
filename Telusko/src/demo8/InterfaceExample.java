package demo8;

interface Abc
{
	//public abstract void show();
	void show();//by default public abstract
}
interface yyy
{
	
}
//multiple inheritence
interface xyz extends Abc,yyy
{
	
}

class AbcImplement implements Abc
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show");
	}
	
}/*
public class InterfaceExample {
public static void main(String[] args) {
	AbcImplement obj=new AbcImplement();
	obj.show();
}
}*/
//Anonymus inner class

public class InterfaceExample {
public static void main(String[] args) {
	AbcImplement obj=new AbcImplement()
			{
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("In show");
		}
			};
	obj.show();
}
}
//lambda expression

/*public class InterfaceExample {
public static void main(String[] args) {
	AbcImplement obj=() ->
			{
		
			System.out.println("In show");
		
			};
			//or
		AbcImplement obj=() ->	System.out.println("In show"); 
			 
	obj.show();
}
}

*/