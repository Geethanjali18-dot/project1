package demo15InnerClass;
enum Mobile1
{
	APPLE,SAMSUNG,HTC;//semi colon optional
	//we can declare variables and defien methods
	int price;
	public int getprice()
	{
		return price;
	}
}
//behind the scene when enum Mobile called it will be converted to class
/*class Mobile
{
	static final Mobile APPLE=new Mobile();
	static final Mobile SAMSUNG=new Mobile();
	static final Mobile HTC=new Mobile();
}*/
public class EnumExample2 {
public static void main(String[] args) {
	/*Mobile m=new Mobile.APPLE;
	switch(m)
	{
	case APPLE:
		System.out.println("Apple is the best");;
		break;
	case SAMSUNG:
		System.out.println("Samsung is the best");;
		break;
	*/
		
		System.out.println(Mobile1.APPLE.getprice());
	}
}

