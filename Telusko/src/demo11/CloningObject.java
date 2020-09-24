package demo11;
/*
 * Shallow copy
 * Deep copy
 * Clone
 */
public class CloningObject {
public static void main(String[] args) throws CloneNotSupportedException {
	Abc1 obj=new Abc1();
	obj.i=5;
	obj.j=6;
	System.out.println(obj);
	Abc1 obj1=new Abc1();
	System.out.println(obj1);
	//copying object
	Abc1 obj2=obj;
	System.out.println(obj2);
	//Shallow copy
	obj.j=8;
	System.out.println(obj);
	System.out.println(obj2);
	
	//Deep copy
	Abc1 obj3=new Abc1();
	obj3.i=obj.i;
	obj3.j=obj.j;
	System.out.println(obj);
	System.out.println(obj3);
	obj.j=9;
	System.out.println(obj);
	System.out.println(obj3);
	
	//cloning
	Abc1 obj4=(Abc1)obj.clone();
	System.out.println("obj4 "+obj4);
	obj.j=10;
	System.out.println("obj "+obj);
	System.out.println("obj4 "+obj4);
	
}
}
class Abc1 implements Cloneable
{
	int i;
	int j;
	@Override
	public String toString() {
		return "Abc1 [i=" + i + ", j=" + j + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}
