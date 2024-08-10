package day20CollectionRevesion;

import java.util.LinkedList;

public class LinkedListDemo3
{
public static void main(String[] args)
{
	LinkedList l = new LinkedList(); 
	
	l.add("dog");
	l.add("cat");
	l.add("horse");
	l.add("cat");
	
	System.out.println(l);

    l.addFirst("Tiger");
    l.addLast("Elephant");
    
    System.out.println(l);
    
    l.getFirst();  //tiger
    l.getLast();  // Elephant
    
    l.removeFirst();
    l.removeLast();
    
    System.out.println(l);
    

}
}
