package demo8;
//giving permission to object
interface p
{
	//marker interface means which has not methods
}
class Demo implements p
{
	void show()
	{
		System.out.println("Hello");
	}
}
public class MarkerInterface  {
public static void main(String[] args) {
	Demo d=new Demo();
	//checking for permission
	if(d instanceof p)//since Demo implements marker interface
	d.show();
	else
		System.out.println("No permission");
}
}
