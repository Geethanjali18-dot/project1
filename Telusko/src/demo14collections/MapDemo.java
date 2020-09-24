package demo14collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//It does not maintain insertion order
//no index
public class MapDemo {
public static void main(String[] args) {
	//Map<String,String> map=new HashTable<>();//Synchronized
	Map<String,String> map=new HashMap<>();//Not Synchronized
	map.put("myName", "Geetha");
	map.put("actress", "Geethanajlai");
	map.put("ceo", "Anjali");
	map.put("ceo", "Anju");//duplicate keys not allowed
	System.out.println( map);
	
	System.out.println(map.get("myName"));
	System.out.println(map.get("actress"));
	System.out.println(map.get("ceo"));
	Set<String> keys=map.keySet();//to get the keys
	for(String key:keys) {
		System.out.println(key+" "+map.get(key));
	}
	
	Set<Map.Entry<String,String>> values1=map.entrySet();
	for(Map.Entry<String,String>e:values1)
	{
		System.out.println(e.getKey()+":"+e.getValue());
		e.setValue("III");
	}
		
}
}
