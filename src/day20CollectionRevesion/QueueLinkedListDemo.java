package day20CollectionRevesion;

import java.util.LinkedList;

public class QueueLinkedListDemo
{
  public static void main(String[] args)
  {
	  LinkedList q = new LinkedList();
		
		//adding ele add() or offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		q.offer(100); //allowed hetero Data
		
		System.out.println(q);//[A, B, C, C, 100] - insertion order is preserved and duplicates are allowed and hetero data also allowed
	                             	
		//get header Element
//		System.out.println(q.element());//A if empty = give exception
//		System.out.println(q.peek());//A if empty = Null
		
		//Return and rmeove element from queue using remove() and poll()
//	    System.out.println(q.remove()); // A is removed---if empty give exception
//        System.out.println(q);//[B, C, C, 100] after remove
	    
//	    System.out.println(q.poll());// A is removed -- if empty will give Null1
//	    System.out.println(q);//[B, C, C, 100] after remove
	    
	    
	    for(Object ele :q)
	    {
	    	System.out.println(ele);
	    }
		
  }
}
