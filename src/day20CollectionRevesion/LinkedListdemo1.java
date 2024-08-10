package day20CollectionRevesion;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListdemo1 
{
  public static void main(String[] args)
  {
	//Declared LinkedList
	  
	 // LinkedList<Integer> l = new LinkedList<Integer>();
	  LinkedList l = new LinkedList();
	  l.add(100);
	  l.add("Welcome");
	  l.add('A');
	  l.add(null);
	  l.add(true);
	  
	  System.out.println(l);
	  
	  System.out.println(l.size());
	  
	  //remove
	  l.remove(3);
	  System.out.println("after remove"+ l);
	  
	  //Insert/adding element in middle of list
	  l.add(2, "Vivek Bhau");
	  System.out.println(l);
	  
	  //Retrieving data
	  System.out.println(l.get(2));
	  
	  //Change the value
	  l.set(4, "mango");
	  System.out.println(l);
	  
	  //contains()
	 boolean check =  l.contains("Vivek Bhau");
	  System.out.println(check);//true
	  
	  //isEmpty
	  System.out.println(l.isEmpty());//false
	  
	  //read all element by using for loop
	  for(int i=0; i<l.size(); i++)
	  {
		  System.out.println(l.get(i));
	  }
	  
	  //read all element by using for each loop

	  
	  for(Object o : l)
	  {
	    System.out.println(o);
	  }
	  
	  //read all element by using Iterator

	  Iterator it = l.iterator();
	  
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  
	  
}
}
