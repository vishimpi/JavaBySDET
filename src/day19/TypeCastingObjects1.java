package day19;

class Parent
{
	String name = "Vivek";
	
	void m1()
	{
		System.out.println("this is m1 from parent...");
	}
}

class Child extends Parent
{
	int id = 101;
	void m2()
	{
		System.out.println("this is m2 from child .....");
	}
}


public class TypeCastingObjects1 
{
public static void main(String[] args) 
{
//   Child c = new Child();
//   System.out.println(c.name);
//   c.m1();
//   System.out.println(c.id);
//   c.m2();
	
//	UpCasting 
//	Parent p = new Child();
//	p.m1();
//	p.m2(); // we can not access 
	
//	Down casting
	Parent p = new Parent();
	Child c = (Child)p;
	c.m1();
	c.m2();

	
	
}
}
