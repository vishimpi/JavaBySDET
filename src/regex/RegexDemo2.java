package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2
{
   public static void main(String[] args) 
   {
//	   String s = "Vivek Shimpi";
//	   Pattern pattern = Pattern.compile("[a-z]+");
//	   Matcher macher = pattern.matcher(s);
//		
//    while(macher.find())
//	{
//		System.out.println(s.substring(macher.start(), macher.end()));
//	}
	   
	   
	   // using . (dot);  => Any one char except a line terminator
//	   String s = "VivekA";
//	   Pattern pattern = Pattern.compile("Vivek.");
//	   Matcher macher = pattern.matcher(s);
//	   
//	   while(macher.find())
//			{
//				System.out.println(s.substring(macher.start(), macher.end()));
//			}
	   
	   
	   // \d => a digit [0-9]
//	   String s = "1234";
//	   Pattern pattern = Pattern.compile("\\d");
//	   Matcher macher = pattern.matcher(s);
//	   
//	   while(macher.find())
//			{
//				System.out.println(s.substring(macher.start(), macher.end()));
//			}
	   
	   
	   // \D => a non-digit [^0-9] digit nahi hona chahiye
	   String s = "ABCD";
	   Pattern pattern = Pattern.compile("\\D");
	   Matcher macher = pattern.matcher(s);
	   
	   while(macher.find())
			{
				System.out.println(s.substring(macher.start(), macher.end()));
			}

	   // \s = a whitespace char : [\t\n\x\0B\f\r]
	   // \S = a non-whitespace char : [^\S]
	   // \w = a word char :[a-zA-Z_0-9]
	   // \W = a non-word char:[^\W]
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
} 
}
