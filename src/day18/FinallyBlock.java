package day18;

public class FinallyBlock 
{
 public static void main(String[] args) 
 {
	String s = null;
	
	try
	{
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		System.out.println("Catch block Handle Exception...");
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("Enter in finally block");
	}
 }
 }
