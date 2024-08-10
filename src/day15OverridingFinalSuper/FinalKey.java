package day15OverridingFinalSuper;
class Test
{
	final int x = 100;
}

public class FinalKey 
{
public static void main(String[] args) 
{
	Test t = new Test();
	System.out.println(t.x);
	//t.x = 200; //bcoz of final key we cant able to change the value.
}
}
