package com.abcd;
//access modifier
public class B {
protected int i;
}
class C extends B
{
	public void show()
	{
		System.out.println(i);
	}
}
class D
{
	public static void main(String[] args) {
		C c=new C();
			c.show();
	}
}