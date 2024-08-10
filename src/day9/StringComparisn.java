package day9;

public class StringComparisn
{
public static void main(String[] args) {
	

	/*String Comparison
	 * 1) == ,equals() difference
	 * 2) String = "Vivek";
	 *    String s = new String("Vivek");
	 * */
	
	//sc1
	
	String s1 = "Vivek";
	String s2 = "Vivek";
	
	System.out.println(s1==s2); //true
	System.out.println(s1.equals(s2));//true
	
	//Sc2
	
	String s3 = new String("Shimpi");
	String s4 = new String("Shimpi");
	System.out.println(s3==s4); //false coz it compare object
	System.out.println(s3.equals(s4));//true coz it compare value of object
	
	
	//sc3
	String s5 = "abc";
	String s6 = new String("abc");
	System.out.println(s5==s6); //false coz it compare object
	System.out.println(s5.equals(s6));//true coz it compare value of object
	


	
}
}
