package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo 
{
public static void main(String[] args)
{

//	Declaration
	
    ArrayList list = new ArrayList();
// 	List mylist = new ArrayList();
	
//	ArrayList<Integer> mlist = new ArrayList<Integer>(); // Store only int.
    
//	Adding Data to ArrayList
    list.add(100);
    list.add('A');
    list.add("Vivek");
    list.add(true);
    list.add(null);

    
    System.out.println(list);
    System.out.println(list.size());

//    remove element from list ----- based on index
    
   list.remove(3); // here 3 is index
   System.out.println(list);
    
//    insert element in arraylist
   list.add(2, "Shimpi");
   System.out.println(list);
   
//   modify element
   
   list.set(2, "Sonawane");
   System.out.println(list);
   
//   Access specific element from array list
   
   list.get(3);
   System.out.println(list.get(3));
   
//     reading all the data from array list
   
//   ***** using for loop
   
   for(int i=0; i<list.size(); i++)
   {
	   System.out.println(list.get(i));
   }   
   
//  ***** using for each loop
   
   for(Object x:list)
   {
	   System.out.println(x);
   }
     
//   by using iterator
   
   Iterator it = list.iterator();
   
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
     
//   Checking array list is empty or not
   list.isEmpty();
   
//   remove all elements
   list.clear();
   

}
}
