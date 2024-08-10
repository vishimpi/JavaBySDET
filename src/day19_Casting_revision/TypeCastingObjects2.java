package day19_Casting_revision;

/*UpCasting = smaller to larger
 *DownCasting = Larger to Smaller 
 *it can be primitive type or it can be object
 *
 *Whenever u do type Casting u have to remember 3 rules (always keep in mind)
 *     Cat ct = (Cat) an;
 *      |   |     |    |
 *      A   b     C    d     ===> here A, C are Classes and b, d are reference variables
 *      
 *  RULE 1: conversion is valid or not
 *          The type of 'd' and 'C' must have some relationship
 *          (either parent to child or child to parent) 
 *          
 *  RULE 2: Assignment is valid or not
 *          'C' must be either same or child of 'A' 
 *          because child class object can hold parent class  
 *          
 *  RULE 3: The underlying object type of 'd' must be either same or child of 'C' 
 *          Ex:  Animal an = new Dog();
 *               Cat ct = (Cat)an; 
 *               
 *               here above in ex underlying object type of 'd' is [new Dog();]
 *                             
 * */	

class Animal{} //Parent
class Dog extends Animal{} 
class Cat extends Animal{}
//there is no relation between dog and cat both are independent classes

public class TypeCastingObjects2 
{
  public static void main(String[] args) 
  {
//RULE 1 - it will give compile time error if we did any mistake while writing code
    //Animal an = new Dog();
    //Cat ct = (Cat)an; //rule one is valid/satisfy
    
    //Dog dg = new Dog();
    //Cat ct = (Cat) dg; //not valid as per rule 1 there is no relationship
    
	  
//RULE 2 - it will give compile time error if we did any mistake while writing code
	 //Animal an = new Dog();
	 //Cat ct =(Cat)an; // valid as per rule 2
	 //Animal a =(Cat)an;// this is also valid as per rule 2
	 
	 //Animal an = new Dog();
	 //Cat ct = (Dog)an; // here rule 1 is satisfy but rule 2 is not 
    
	  
//RULE 3 - it will exception run time that is ClassCastException if we not satisfy rule 3
	 
	 //Animal an = new Dog(); //here The underlying object type of 'd' is [new Dog();]
	 //Cat ct = (Cat)an; // And its[new Dog();] not same or child of 'C'[(Cat)]
	                   //so it will give exception at run time
	                   //do invalid as per rule 3
	 
	 
	 //Rule1, Rule2, Rule3
	  Animal an = new Dog();
	  Dog dg = (Dog) an;    //all 3 rules are valid 
      System.out.println(dg);
  }
}
