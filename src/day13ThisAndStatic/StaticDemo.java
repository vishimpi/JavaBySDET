package day13ThisAndStatic;

public class StaticDemo 
{
	static int a =10;
	int b=20;
	
	static void m1()
	{
		System.out.println("this is m1 static method");
	}
	
	void m2()
	{
		System.out.println("this is non-static method");
	}
	
	void m()
	{
		m1();
		m2();
	}

public static void main(String[] args)
{
	m1();
	System.out.println(a);
	
	StaticDemo sd = new StaticDemo();
	System.out.println(sd.b);
	sd.m2();
	
	sd.m();
	

	
}
}
