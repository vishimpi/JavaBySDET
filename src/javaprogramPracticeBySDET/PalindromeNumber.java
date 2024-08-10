package javaprogramPracticeBySDET;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		
	int x = 121;
	int num = x;
	int rev= 0;
	int rem=0;
	
	while(num != 0)
	{
		rem = num%10;
		rev = rev*10+rem;
		num= num/10;
		
	}
	if(x==rev)
	{
		System.out.println("num is palindrome");
	}
	else
	{
		System.out.println("Number is not Palidrome");
	}
	}
}
