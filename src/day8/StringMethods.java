package day8;

import java.util.Arrays;

public class StringMethods
{
	
public static void main(String[] args) 
{
	
//	String s = "Welcome";
	/*String s1 = "Welcome";
	String s2= s;
	String s3 = new String (s1);
	boolean check = s==s1; //true
	boolean check1 = s1==s2;//true
	boolean check2 = s==s3; // false
	System.out.println(check);
	System.out.println(check1);
	System.out.println(check2);

	
	//length()
   int l =   s.length();
   System.out.println(l);
   
   //concat()  joining Strings
   String s1 = " to java";
   String c = s.concat(s1);
   System.out.println(c);
   System.out.println(s+s1);
   
  //trim()- it will remove spaces right and left side
   String s = "  vivek  ";
   System.out.println(s);
   System.out.println(s.trim());
   
    //charAT(); - return the character from String base on index
   
   char c =  s.charAt(3);
   System.out.println(c);
   
//   contains(); - checking that string is part of man String
   System.out.println(s.contains("viv")); //true
   
   
*/ 
	
	
//   equals(), equalsIgnoreCase() = compare String
//      String s1 = "welcome";
//      String s2 = "welcome";
//      
//      System.out.println(s1==s2); //true
//      System.out.println(s1.equals(s2)); //true
      
//      replace(); - it will replace single/multiple (sequence of character in a String)
//   String s = "welcome to java and selenium";
//   System.out.println(s.replace('s', 'q'));
//   System.out.println(s.replace("and", "or"));
   
   
//   subString() - extract sub from main , thumb rule is add +1 in index see example below
//   s="vivek";
//   System.out.println(s.substring(1,5)); 

   
   
   //split() - split the String into multiple parts based on delimeter 
//   s="viv@gmail.com";
//   String [] a = s.split("@");
//   System.out.println(a[0]); // viv
//   System.out.println(a[1]); // gmail.com
//
//
//   System.out.println(Arrays.toString(a));
//   for(String x : a)
//   {
//	   System.out.println(x);
//   }
   
   
//   ex1
//   String amount = "$15,20,55"; //exp = 152055
//   String newamt = amount.replace("$", "").replace(",", "");
//   System.out.println(newamt);
   
   //ex2
  String s="abc,123@xyz"; //abc 123 xyz
   String []ar =  s.split(",");
  Arrays.toString(ar);
   
  String arr2[] = ar[1].split("@");
  Arrays.toString(arr2);
  
  System.out.println(ar[0]+" "+arr2[0]+" "+arr2[1]);
  
  
  //ex3
  String name = "Vivek Shimpi";
  //check vivek is part of String or not
  
  boolean check = name.contains("Vivek");
  System.out.println(check);
 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

}
}
