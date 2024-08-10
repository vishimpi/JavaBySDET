package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1
{
 public static void main(String[] args)
 {
	Pattern pattern = Pattern.compile("[^abc]");

	Matcher macher = pattern.matcher("1");
	
	if(macher.matches())
	{
		System.out.println("Pattern match successfully");
	}
	else
	{
		System.out.println("invalid input");
	}
}
}
