package day19;

public class TypeCastingConcept
{
  public static void main(String[] args) 
  {
//	Up casting  - automatic ----- smaller to larger
	  int intvalue = 100;
	  long lv = intvalue;
	  System.out.println(lv);
	  
//		Down casting  - Manually -----larger to smaller 
	  
	  long lvalue = 12345678;
	  int a = (int)lvalue;
	  System.out.println(a);

  }
}
