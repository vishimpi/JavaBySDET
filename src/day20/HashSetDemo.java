package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{
public static void main(String[] args) 
{
//	Declaration
	
	HashSet set = new HashSet();
	
//	Set set = new HashSet();
	
//   HashSet<String> set = new HashSet<String>();

//	Add element
	set.add(100);
	set.add(100);
	set.add(null);
	set.add(null);
	set.add('V');
	set.add(1.5);
	set.add("Vivek");
	set.add(false);
	
	System.out.println(set);
	
//	Remove element

	set.remove(1.5);
	System.out.println(set);
	
//	Inserting Elements ---- Inserting elements is not possible in Hash set
	
//  Access specific element-----not possible
//	but there is way
//	Convert HashSet into ArrayList
	ArrayList al = new ArrayList(set);
	System.out.println(al);
//	So now as we have same elements in ArrayList we can use its Method to access it
	
//	Read all elements by using for each loop
	
	for(Object x:set)
	{
		System.out.println(x);
	}
	
	 Iterator it =set.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	



}
}
