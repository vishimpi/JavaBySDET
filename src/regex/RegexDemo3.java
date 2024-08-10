package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3
{
   public static void main(String[] args) {
	
	   

	   //********** Quantifiers**********//
	   
	   //X? = optional, X occurs once or not at all
	   //X* = X occurs zero or more time
	   //X+ = X occurs one or more time
       //X{n} = X occurs exactly n time
       //X{n,} = X occurs n or more times
	   
	   
	   /*
	    * if one pattern is followed by another, the two pattern must match consecutively
	    * for example = [A-Za-z]+[0-9] will match one or more letters immediately followed by 1 digit
	    * The vertical bar, | , is used to separate alternative
	    * e.g = the pattern abc|xyz will match either abc or xyz 
	    * */
	   
	   String input = "9876543212";
	   Pattern pattern = Pattern.compile("[0-9]{10}");
	   Matcher macher = pattern.matcher(input);
	   
	   if(macher.matches())
	   {
		   System.out.println("Pattern Matched");
	   }
	   else
	   {
		   System.out.println("Invalid Pattern");
	   }
}
}
