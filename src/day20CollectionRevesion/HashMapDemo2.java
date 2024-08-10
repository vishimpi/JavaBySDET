package day20CollectionRevesion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 
{
  public static void main(String[] args)
  {
	//HashMap m = new HashMap();
	
	HashMap<Integer, String> m = new HashMap<>();
	
	m.put(101, "vivek");
	m.put(102, "akshay");
	m.put(103, "shubham");
	m.put(104, "chetan");
	m.put(105, "aman");
	
	System.out.println(m);
	
	//get value of key
	
	System.out.println(m.get(101));

	//remove
	
	m.remove(102); // remove paired from hashMap
	System.out.println(m);
	
	
	System.out.println(m.containsKey(101));
	System.out.println(m.containsValue("vivek"));
	
	System.out.println(m.isEmpty());
	
	System.out.println(m.keySet()); // return all the keys as set
	
	for(Object s:m.keySet())
	{
		System.out.println(s);
	}
	
	
	System.out.println(m.values());  //return all the values as Collection
	
	for(Object s1:m.values())
	{
		System.out.println(s1);
	}
	
	
	System.out.println(m.entrySet());//return all entry as Set Object
	 
	 //capture key along with value one by one
	
	for(Object i : m.keySet())
	{
		System.out.println(i+" = "+m.get(i));
	}
	
	//Entry Methods
	
	//All entry from HashMap
	
	for(Map.Entry entry : m.entrySet())
	{
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	
	//iterator
	
	Set s = m.entrySet(); // all keys with values return Set
	
	Iterator itr = s.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry entry = (Entry) itr.next();
		
		System.out.println(entry.getKey()+"  "+entry.getValue());	
	}
	
	
	
  }
}
