package day12EncapAndpolymorph;
// *********** Method OverLoading *****************  
public class ADDbtPoly 
{
int a=10, b=20;

 void add()
{
	System.out.println(a+b);
}

void add(int x, int y)
{
	System.out.println(x+y);
}



public static void main(String[] args) 
{
	ADDbtPoly a = new ADDbtPoly();
	a.add();
	a.add(100, 200);
}
}
