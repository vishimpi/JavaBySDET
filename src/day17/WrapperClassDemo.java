package day17;

public class WrapperClassDemo
{
public static void main(String[] args)
{
	String price= "100";
	String price1= "200";

	
    int x = Integer.parseInt(price);
    int y = Integer.parseInt(price1);
	
	System.out.println(x+y);
	
//	integer to String
	
	int a = 100;
	String b = Integer.toString(a);
	String c = String.valueOf(a);
	System.out.println(b+c);

//	char to String
	
	char  n = 'A';
	String z = String.valueOf(n);
	System.out.println(z);
	
	
	
}
}
