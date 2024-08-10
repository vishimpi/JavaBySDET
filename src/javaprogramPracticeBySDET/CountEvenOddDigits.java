package javaprogramPracticeBySDET;

public class CountEvenOddDigits 
{
public static void main(String[] args) 
{
	int num = 12345678;
	int rem;
	int evenCount = 0;
	int oddCount = 0 ; 
	
	while(num>0)
	{
		rem = num%10;
		if(rem%2==0)
		{
			evenCount++;
		}
		else
		{
			oddCount++;
		}
		
		num = num/10;
	}
	System.out.println(evenCount);
	System.out.println(oddCount);

}
}
