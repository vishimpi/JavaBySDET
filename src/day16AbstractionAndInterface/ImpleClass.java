package day16AbstractionAndInterface;

class C2
{
	int z = 300;
	void m3()
	{
		System.out.println(z);
	}
}





public class ImpleClass extends C2 implements I1, I2
{
	public void m1()
	{ 
		System.out.println("this is m1 "+ x);
	}
	
	public void m2()
	{
		System.out.println("this is m2 "+ y);
	}
	
public static void main(String[] args) 
{
	ImpleClass ic = new ImpleClass();
	ic.m1(); // from abstract
	ic.m2();
	ic.m3(); // from class
}
}
