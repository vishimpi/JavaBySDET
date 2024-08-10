package day15OverridingFinalSuper;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	 void m2(int b)
     {
	     System.out.println(b);
     }
}

    

class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a);
	} 
	
	void m2(int a, int b)
	{
		
		System.out.println(a+b);
	}
}









public class OverLoadingVsOverriding
{
public static void main(String[] args) 
{
	XYZ xyz = new XYZ();
	xyz.m2(2, 2);
	
}
}
