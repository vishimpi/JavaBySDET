package day15OverridingFinalSuper;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 11.5;
	}	

}


public class OverridingDemo 
{
public static void main(String[] args) 
{
	ICICI ic = new ICICI();
	double d = ic.roi();
	System.out.println(d);
	
	SBI sbi = new SBI();
	double e = sbi.roi();
	System.out.println(e);
			
}
}
