package demo6;

import java.util.Arrays;

public class VarArgs {
public static void main(String[] args) {
Display obj=new Display();
obj.show(5);
obj.show(5,6);
//varargs
obj.show(5,6,7);
obj.show(5,6,7,8);
//Arrays.asList(arg0) //varargs
}
}

class Display{
	public void show(int a)
	{
		System.out.println(a+"in show A");
	}
	public void show(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	//varargs -> variable Arguments same type
	public void show(int...a)
	{
		for(int i:a)
		{
			System.out.println(i);	
		}
		
	}
	
}
