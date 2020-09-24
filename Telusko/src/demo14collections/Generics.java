package demo14collections;

import java.util.ArrayList;
import java.util.List;

class Container<T extends Number>//Type T
{
	T value;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public void show()
	{
		System.out.println(value.getClass().getName());
	}
	
	public void demo(ArrayList<? extends T> obj)//sub class
	{
		
	}
	public void demo1(ArrayList<? super T> obj)//super class
	{
		
	}
	
}
public class Generics {
	public static void main(String[] args) {
		int value=5;
		//List<Integer> values=new ArrayList();
		//values.add(4);
		//values.add("Geetha");
		//int i=Integer.parseInt(values.get(1).toString());
		List<Integer> values;
		Container<Number> obj1=new Container();
		//Container<Float> obj=new Container();
		Container<Integer> obj=new Container();
		obj.value=9;
		obj.show();
		
	}


}
