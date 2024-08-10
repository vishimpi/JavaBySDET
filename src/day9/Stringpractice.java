package day9;

public class Stringpractice 
{
  public static void main(String[] args) 
  {
//	reverse string Way 1
	  String rev = "";
	  String s = "Vivek";
	  for(int i=0; i<s.length(); i++)
	  {
		  char c = s.charAt(i);
		   rev = c+rev;
	  }
	  System.out.println(rev);
	  
	  
//		reverse string Way 2
	  
	  String s1 = "nayana";
	  String reve = "";
	  
	  for(int i=s1.length()-1; i>=0; i--)
	  {
		  char ch = s1.charAt(i);
				reve = reve+ch;
	  }
      System.out.println(reve);
      
//		reverse string Way 3
      
      String s3 = "ravindra";
      String re = "";
      
     char a[]= s3.toCharArray();
     
     for(int i=0; i<a.length; i++)
     {
    	 re = a[i]+re;
     }
      System.out.println(re);
      
//		reverse string Way 4 using StringBuffer class
      
      StringBuffer x = new StringBuffer("Viman");
      System.out.println(x.reverse());
      
//		reverse string Way 4 using StringBuilder class
      
      StringBuilder y = new StringBuilder("Flight");
      System.out.println(y.reverse() );

      
      
      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

  }
}
