package demo8;

public class AbstractClassExample {
public static void main(String[] args) {
	//can not instantiate abstarct class
	//MaheshPhone obj=new MaheshPhone();
	//obj.call();
	MaheshPhone obj=new SureshPhone();
	obj.call();
	obj.cook();
	obj.dance();
	obj.move();
}
}

abstract class MaheshPhone
{
	public void call()
	{
		System.out.println("Calling");
		
	}
	//abstract methods
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
	
}
abstract class RameshPhone extends MaheshPhone
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("moving");
		
	}

	
}
//concrete class
class SureshPhone extends RameshPhone
{

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Dancing");
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Cooking");
	}
	
}