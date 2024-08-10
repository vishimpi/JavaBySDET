package day14Inheritance;
class A
{
	int a = 20;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b = 30;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c= 40;
    void print()
    {
	   System.out.println(c);
    }
}

public class Inheritance
{
public static void main(String[] args) 
{
	C c = new C();
	c.display();
	c.show();
	c.print();
}
}
