package day19;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingObject2 
{
  public static void main(String[] args) 
  {
	 Animal an = new Dog();
	 Cat ct = (Cat)an;
  }
}
