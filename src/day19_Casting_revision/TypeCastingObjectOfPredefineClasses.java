package day19_Casting_revision;

// A b = (C) d;
/*Whenever u do type Casting u have to remember 3 rules (always keep in mind)
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
*               here above in ex- underlying object type of 'd' is [new Dog();]
**/

public class TypeCastingObjectOfPredefineClasses
{
 public static void main(String[] args)
 {
	//Ex1: 
	//Object o = new String ("Vivek");
	//StringBuffer sb = (StringBuffer) o ; //rule1= passed, rule2=passed, rule3=failed(no relation between String and StringBuffer)
	
	//Ex2:
	//String s = new String("Vivek");
	//StringBuffer sb = (StringBuffer) s; //rule1=failed 
	 
    //Ex3:
	//Object o = new String ("Vivek");
	//StringBuffer sb = (String) o; //rule1= passed, rule2=failed
	
	//Ex4:
	//String s = new String("Vivek");
	//StringBuffer sb = (String) s; //rule 1= passed, rule2=failed
	 
	//Ex5
	 Object o = new String ("Vivek");
	 String s = (String) o;   //rule1=passed, rule2=passed, rule3=passed
	 System.out.println(s);

 }
}
