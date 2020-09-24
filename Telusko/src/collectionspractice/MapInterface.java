package collectionspractice;
//HashTable-Synchronized
//HashMap-Not Synchronized
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	map.put("myName","Geetha");
	map.put("boss","Geetha");
	map.put("actress", "Shradha");
	map.put("actress", "Aishwarya");
	map.put("ceo","Indira");
	System.out.println(map);
	Set<String> keys = map.keySet();
	for(String key:keys)
	{
		System.out.println(key+" : "+map.get(key));
	}
}
}
