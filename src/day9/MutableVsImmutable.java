package day9;

import java.util.Arrays;

public class MutableVsImmutable
{
public static void main(String[] args)
{
	//mutable- can change
	int a[] = {20,12,10,98,30,40};
	System.out.println(Arrays.toString(a));//before sorting
	Arrays.sort(a); //mutable
	System.out.println(Arrays.toString(a));//after sorting
	
	//Immutable
	String s = new String ("Vivek");
	System.out.println(s);//before concat
	 String concatString = s.concat(" Shimpi");
	System.out.println(s);//after concat
     System.out.println(concatString);
	
     
   
	
}
}
