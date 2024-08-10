package day16AbstractionAndInterface;

interface Shape
{
	int length = 10; //final and Static 
	int width = 20; // final static
	
	void rectangle(); // abstract method
	
	default void square()
	{
		System.out.println("this is default method");
	}
	
	static void circle()
	{
		System.out.println("this is static method");
	}
}

public class InterfaceDemo implements Shape
{
	public void rectangle()
	{
		System.out.println("this is abtraact method");
	}

	public static void main(String[] args) 
	{
		InterfaceDemo ifd = new InterfaceDemo();
		ifd.rectangle(); // abstract
		ifd.square(); //default
		Shape.circle(); // static method can directly access from interface
		
		//Scenario 2
		Shape sh = new InterfaceDemo(); //up casting
		sh.rectangle();
		sh.square();
		Shape.circle();
	}

}
