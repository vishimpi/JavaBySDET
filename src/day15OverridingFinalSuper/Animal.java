package day15OverridingFinalSuper;

public class Animal 
{
 String color = "black";
}

class Dog extends Animal
{
	String color = "white";
	
	void displaycolor()
	{
		System.out.println(super.color);
	}
}