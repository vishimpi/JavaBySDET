package day10;

public class Employee 
{
 int eid;
 String ename;
 String job;
 int salary;
 
 void diaplay()
 {
	 System.out.println(eid);
	 System.out.println(ename);
	 System.out.println(job);
	 System.out.println(salary);

 }
 
 public static void main(String[] args) 
 {
	Employee emp1 = new Employee();
	emp1.eid = 101;
	emp1.ename = "Vivek";
	emp1.job = "QA";
	emp1.salary = 900000;
	emp1.diaplay();
 }
 
}
