package demo15InnerClass;
//Enum class extends Object class
//enum Mobile2 extends- not possible because by default it extends Enum class
//enum Mobile2 implements interface B possible
enum Mobile2 
{
	APPLE(100),SAMSUNG,HTC(90);//semi colon optional
	//we can declare variables and defien methods
	int price;
	/*class Mobile
	{
		static final Mobile APPLE=new Mobile(100);
		static final Mobile SAMSUNG=new Mobile(80);
		static final Mobile HTC=new Mobile(90);
	}*/
	Mobile2()
	{
		price=80;
		System.out.println("Constructor");
	}
	Mobile2(int p)
	{
		price=p;
	}
	
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
public class EnumExample3 {
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
		
		System.out.println(Mobile2.APPLE.getprice());
		System.out.println(Mobile2.APPLE.ordinal());
		System.out.println(Mobile2.SAMSUNG.ordinal());
		System.out.println(Mobile2.HTC.ordinal());
		//to fetch constants
		Mobile2 m[]=Mobile2.values();
		for(Mobile2 mobile:m)
		{
			System.out.println(mobile);
		}
	}
}

