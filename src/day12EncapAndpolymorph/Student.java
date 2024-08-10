package day12EncapAndpolymorph;

public class Student {
	private int id;
	private String name;
	private String phone;
	private String email;

	public Student(int id, String name, String phone, String email) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void printStudentDetails() {
		System.out.println(id+" "+name+" "+phone+" "+email);
//		System.out.println(name);
//		System.out.println(phone);
//		System.out.println(email);
//		System.out.println();

	}
}
