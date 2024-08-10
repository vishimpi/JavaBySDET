package day20CollectionRevesion;

import java.util.HashMap;

public class HashMapdemo 
{
 public static void main(String[] args) 
 {
	//Declartion
	 //HashMap hm = new HashMap();
	
	 HashMap<Integer, String> hm = new  HashMap<Integer, String>();
	 
	 //Adding pair
	 
	 hm.put(101, "Vicky");
	 hm.put(102, "Vivek");
	 hm.put(102, "Mahesh");
	 hm.put(103, "Dinesh");
	 hm.put(104, "Vivek");
 
	 
	 System.out.println(hm);
	 System.out.println(hm.size());
	 
	 //remove pair()
	 hm.remove(104);// so base on key pair will remove so here we pass the key
	 System.out.println(hm); // after remove pair
	 
	 //Access value 
	System.out.println(hm.get(102));
	
	//access only key
	System.out.println(hm.keySet());
	
	//access only value
	System.out.println(hm.values());
	
	
	//Access key and value both
	System.out.println(hm.entrySet());
	
	 //read data from HashMap using for each loop
	for(int k :hm.keySet())
	{
		System.out.println(k+" "+hm.get(k));
	}
	
	
	//using iterator
	
	
	
	
	
	
	
	
 }
}
