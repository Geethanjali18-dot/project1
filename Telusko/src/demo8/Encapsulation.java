package demo8;
//declaring private and using setters and getters is encapsulation
public class Encapsulation {
public static void main(String[] args) {
	Encap e=new Encap();
	e.setI(7);
	System.out.println(e.getI());
}
}

class Encap
{
	private int i;//declaring private
	public void setI(int j)
	{
		i=j;
	}
	public int getI()
	{
		return i;
	}
}
