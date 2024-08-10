package day20CollectionRevesion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 
{
 public static void main(String[] args)
 {
	LinkedList<String> l = new LinkedList<String>();
	l.add("X");
	l.add("Y");
	l.add("Z");
	l.add("A");
	l.add("B");
	l.add("C");

	LinkedList<String> new_l = new LinkedList<String>();
	new_l.addAll(l);
	System.out.println(new_l);
	
	new_l.removeAll(l);
	System.out.println(new_l);//[]
	
	//sort
	 Collections.sort(l);
	 System.out.println(l);
	 
	 Collections.sort(l, Collections.reverseOrder());
	 System.out.println(l);
	 
	 

}
}
