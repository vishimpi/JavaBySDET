package day20CollectionRevesion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
 public static void main(String[] args) 
 {
	//Declaration of ArrayList
	 ArrayList myList = new ArrayList();
//	 List mylist = new ArrayList();
//	 ArrayList<String> myList = new ArrayList<String>(); // this will only store String

	 
	 //Adding data in ArrayList
	 myList.add(100);
	 myList.add(10);
	 myList.add('a');
	 myList.add("viv");
	 myList.add(1.0);

	 //printing data
	 System.out.println(myList);
	 
	 //size of data
	 System.out.println(myList.size());
	 
	 //remove element from arraylist
	 System.out.println(myList.remove(1));//here 1 is index
	 
	 System.out.println(myList);//after remove 10
	 
	 //insert element somewhere in list
       myList.add(0, 200);
  	 System.out.println(myList);//after insert new value
     
  	 //Modify the element
  	 myList.set(0, "Vivek");
  	 System.out.println(myList);//after replacing new value

  	 //extract/access specific element
  	 System.out.println(myList.get(0));
  	 
  	 //read all the data from ArrayList
  	 
  	 //using normal for loop
//  	 System.out.println("get data using normal for loop");
//  	 for(int i=0; i<myList.size(); i++)
//  	 {
//  		 System.out.println(myList.get(i));
//  	 }
//  	 
//  	 //using enhanced for loop
//  	 System.out.println("get data using enhanced for loop");
//  	 for(Object x:myList)
//  	 {
//  		System.out.println(x); 
//  	 }
  	 
  	 //using iterator
  	 System.out.println("get data using Iterator");
  	 Iterator it = myList.iterator();
  	 
  	 while(it.hasNext())
  	 {
  	 System.out.println(it.next());
  	 }
  	 
  	 
  	 //Is my ArrayList is Empty or not
  	 
  	 System.out.println(myList.isEmpty());
  	 
  	 //remove specific data from ArrayList();
	 ArrayList myList2 = new ArrayList();
	 myList2.add('a');
	 myList2.add("viv");
  	 
  	 myList.removeAll(myList2);
  	 System.out.println(myList);
  	 
  	 //clear all data
  	 myList.clear();
  	 System.out.println(myList.isEmpty());
  	 
  	 
  	 
  	 
  	 
  	 
  	 
  	 
  	 
 }
}
