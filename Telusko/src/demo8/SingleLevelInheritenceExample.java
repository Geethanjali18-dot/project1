package demo8;
//Single Level
public class SingleLevelInheritenceExample {
public static void main(String[] args) {
	AddSub a=new AddSub();
	a.num1=5;
	a.num2=4;
	a.sum();
	System.out.println(a.result);
	a.sub();
	System.out.println(a.result);
}
}

class Add
{
	int num1,num2,result=0;
	public void sum()
	{
		result=num1+num2;
	}
}

class AddSub extends Add
{
	int result1=0;
	public void sub()
	{
		result=num1-num2;
	}
}
