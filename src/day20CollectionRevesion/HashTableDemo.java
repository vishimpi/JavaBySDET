package day20CollectionRevesion;

import java.util.Hashtable;

public class HashTableDemo
{
  public static void main(String[] args)
  {
	/*
	 * Hashtable t = new Hashtable(); //capacity is 11 and load factor is 0.75
	 * */
	
	//Hashtable t1 = new(initial capacity); // create hashtable object with some capacity
	
	//Hashtable t = new Hashtable(initial capacity, fill ratio/load factor);
	  
	  Hashtable <Integer, String> t = new Hashtable<Integer, String>();
	  
	  //add data
	  
	  t.put(101, "vivek");
	  t.put(102, "chaman");
	  t.put(103, "chetan");
	  t.put(104, "aman");

	  //t.put(105, null); //null pointer exception
	  
	  System.out.println(t);
	  
	  //get specific data
	  System.out.println(t.get(101));
	  
	  t.remove(102);
	  System.out.println(t);
	  
	  System.out.println(t.containsKey(101)); //true
	  System.out.println(t.containsKey(106)); //false

	  System.out.println(t.containsValue("vivek")); //true
	  
	  System.out.println(t.isEmpty());
	  
	  System.out.println(t.keySet());
	  System.out.println(t.values());
	  
	  

	  
	  
	  
	  
  }
}
