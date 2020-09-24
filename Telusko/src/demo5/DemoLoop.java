package demo5;

public class DemoLoop {
public static void main(String[] args) {
int i=1;
while(i<=10)
	{
		System.out.println(i);
		i++;//i=i+1 post increment pre increment ++i
	}
	

do
{
	System.out.println(i);
	i++;
}while(i<10);

for(int j=1;j<=10;j++)
{
	System.out.println(j);
	
}
}
}
