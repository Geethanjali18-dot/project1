package demo14collections;
import demo14collections.Laptop;
import demo14collections.Laptop1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVSComparator {
public static void main(String[] args) {
	List<Laptop> laps=new ArrayList<>();
	laps.add(new Laptop("Dell",16,800));
	laps.add(new Laptop("Apple",8,1200));
	laps.add(new Laptop("Acer",12,700));
	
	Collections.sort(laps);
	for(Laptop l:laps)
	{
		System.out.println(l);
	}
	
	//comparator
	
	List<Laptop1> laps1=new ArrayList<>();
	laps1.add(new Laptop1("HP",16,800));
	laps1.add(new Laptop1("DELL",8,1200));
	laps1.add(new Laptop1("APPLE",12,700));
	
	Comparator<Laptop1> com=new Comparator<Laptop1>()
			{
		public int compare(Laptop1 l1,Laptop1 l2)
		{
			if(l1.getPrice()>l2.getPrice())
				return 1;
			else
				return -1;
				}
		};
		
	Collections.sort(laps1,com);
	for(Laptop1 l:laps1)
	{
		System.out.println(l);
	}
	
	
}
}
