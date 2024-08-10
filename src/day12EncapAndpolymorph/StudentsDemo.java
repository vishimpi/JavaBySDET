package day12EncapAndpolymorph;

import java.util.ArrayList;
import java.util.List;

public class StudentsDemo
{
public static void main(String[] args) {
	
	List <Student> students = new ArrayList<>();
	
	students.add(new Student(1, "vivek", "123-456", "vivek@gmail.com"));
	students.add(new Student(2, "aman",  "123-456", "aman@gmail.com"));
	students.add(new Student(3, "chetan", "123-456", "chetan@gmail.com"));
	
	for(Student student: students)
	{
		student.printStudentDetails();
	}
}
}
