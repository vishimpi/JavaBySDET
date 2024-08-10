package day20CollectionRevesion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{
 public static void main(String[] args) 
 {
	//Declaration
	 
	 HashSet mySet = new HashSet();
//	 Set myset = new HashSet();
//	 HashSet<String> myset1 = new HashSet<String>();
	 
	 //Adding Element to HashSet
	 mySet.add(100);
	 mySet.add(10);
	 mySet.add('a');
	 mySet.add("viv");
	 mySet.add(1.0);
	 mySet.add(null);
	 
	 System.out.println(mySet );
	 
	 //remove element from hashset
	 
	 mySet.remove(100);
	 System.out.println(mySet);
	 
	 //Inserting Element === not possible
	 //Accessing Specific element is not possible
	 
	 //Convert HashSet to ArrayList
	 
	 ArrayList al = new ArrayList(mySet);
	 
	 System.out.println(al);
	 
	 System.out.println(al.get(0));
	 
	 //read all element
	 //normal for loop we cant use coz there is no index in hashset
	 
	 
	 //by using for each aka enhance loop it possible
	 for(Object x: mySet)
	 {
		 System.out.println(x);
	 }
	 
	 //By using Iterator
	 Iterator <Object> it = mySet.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}