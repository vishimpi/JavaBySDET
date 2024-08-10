package day13ThisAndStatic;

public class ThisKeyword 
{
	
	int x,y; // class variable / instance variable
	
	ThisKeyword(int x, int y)
	{
		this.x = x; //this keyword is representing the class 
		this.y = y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
public static void main(String[] args)
{
	ThisKeyword tk = new ThisKeyword(100,200);
	
	tk.display();
}
}
