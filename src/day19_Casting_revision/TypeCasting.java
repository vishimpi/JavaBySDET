package day19_Casting_revision;

/*
 * Type Casting - We can covert data from one type to another type
 * 2 types - UpCasting (Widening) - converting value from smaller to higher/Larger
 *           int ==> long
 *           float ==> double
 *           DownCasting (narrowing) -converting value from larger to smaller
 *           long ==> int
 *           double ==> float
 *          
 *           byte => short => int => long => float => double
 *          |----------- smaller  ==>  larger -------------|
 * */

public class TypeCasting 
{
  public static void main(String[] args)
  {
	 //upcasting - automatic ---smaller to larger
	  int value = 100;
	  long l = value;
	  System.out.println(l);
	  
	  //Down casting - Manually == Larger to smaller
	  long lo = 100;
	  int v = (int)lo;
	  System.out.println(v);
  }
}
