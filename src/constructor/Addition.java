package constructor;

public class Addition
{
	private int x;
	private int y;
	
       Addition()
       {
	     x=10;
	     y=20;
	     System.out.println(x+y);
       }
       
       public void m1(int x, int y)
       {
    	   System.out.println(x+y);
       }
      
       public static void main(String[] args)
       {
    	   Addition add = new Addition();
    		add.m1(5, 10);	   
	}
}
