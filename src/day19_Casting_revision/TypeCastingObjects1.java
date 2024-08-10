package day19_Casting_revision;

class Parent
{
   String name = "Vivek";
   void m1()
   {
	   System.out.println("this is m1 from parent");
   }
}

 class Child extends Parent
 {
    int id = 101;
    
    void m2()
    {
    	System.out.println("this is m2 from child");
    }
 }

public class TypeCastingObjects1
{
public static void main(String[] args)
{
	/*
	 * Child c = new Chile(); = we use this if u exactly know what type of object it returning
	 *                        = here we can access everything from child and parent
	 *                        
	 * Parent p = new Child(); = we use this if u do not know what type of object it returning
	 *                         = here we can only access parent not child 
	 * */
	
	//Child c = new Child();
	
	//here when u create object of child class [new Child()]
	//and reference variable also from child class [Child c] both are same
	//so in there is no problem at all u can call all from parent too because there is no up and down Casting
	
	//System.out.println(c.name);//parent
	//c.m1(); //parent
	//System.out.println(c.id);
	//c.m2();
	
	//Parent p = new Child(); // Up casting / Child class object we always store in parent variable
	// parent class reference variable can always hold child class object
	// here u can not access variables and method from child 
	// because variable here is parent [Parent p = new Child()]
	
	//System.out.println(p.name); //accessible
	//p.m1(); //parent accessible
	//System.out.println(p.id); // not accessible because id is from child
    //p.m2(); // not accessible because m2 is from child
	
	//DownCasting
	
	//Parent p = new Parent();
	//Child c = (Child)p; //downCasting
	//here compile time there is no error,but we get run time error because this is parent class object [Parent p = new Parent();]
	//and we trying to store it into child 
	//and Child c and p not matching at time of down casting  [Child c = (Child)p;]
	//System.out.println(c.name);
	//System.out.println(c.id);
	//c.m1();
	//c.m2();
	
	//to solve this we do downCasting
//	Parent p = new Child(); // Child class object we always store in parent variable
//	Child c = (Child)p; // downCasting
//	System.out.println(c.name);
//	System.out.println(c.id);
//	c.m1();
//	c.m2();

	
	
	
	
	
	
}
}
