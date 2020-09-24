package demo8;
//Multi Level
public class InheritenceExample {
public static void main(String[] args) {
	AddSubMul a=new AddSubMul();
	a.num1=5;
	a.num2=4;
	a.sum();
	System.out.println(a.result);
	a.sub();
	System.out.println(a.result);
	a.multi();
	System.out.println(a.result);
}
}

class Add1
{
	int num1,num2,result=0;
	public void sum()
	{
		result=num1+num2;
	}
}

class AddSub1 extends Add1
{
	
	public void sub()
	{
		result=num1-num2;
	}
}
class AddSubMul extends AddSub1
{
	public void multi()
	{
		result=num1*num2;
	}
}
