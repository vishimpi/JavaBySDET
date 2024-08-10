package day9;

public class StringVsStringBufferVsStringBuilder
{
public static void main(String[] args) {
	
	  /*String is Immutable in nature means can not change'
     *StringBuffer is mutable
     *StringBuilder is Immutable*/
	
	String s = new String ("Vivek");
	System.out.println(s);//before concat
	s.concat(" Shimpi");
	System.out.println(s);//after concat
	
	//StringBuffer - mutable
	StringBuffer s1 = new StringBuffer("Welcome");
	s1.append(" to java");
	System.out.println(s1);
	
	//StringBuilder 
	StringBuilder s2 = new StringBuilder("Viman");
	s2.append(" Nagar");
	System.out.println(s2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
