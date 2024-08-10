package day11;

public class Student 
{
 int sid;
 String sname;

 void printStudentData()
{
System.out.println(sid+"  "+sname);	
}

 void setStudentData(int id, String name)
 {
	 sid = id; 
	 sname = name;
 }

	
	
	
	
	
	
	
	
public static void main(String[] args) 
{
	Student s = new Student();
//	s.sid = 01;
//	s.sname = "Vivek";
//	s.printStudentData();
	
	s.setStudentData(01, "manus");
    s.printStudentData();


}
}
