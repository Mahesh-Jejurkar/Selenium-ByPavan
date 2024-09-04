package javaprograms;

public class Student {
	int s_id;
	String s_name;
	char s_grade;
	
	//Default constructor
	public Student() {
		s_id = 0;
		s_name = "No_Name";
		s_grade = 'N';
	}
	
	//Parameterized constructor
	public Student(int id, String name, char grade) {
		s_id = id;
		s_name = name;
		s_grade = grade;
	}
	
	
	public void setData(int id, String name, char grade) {
		s_id = id;
		s_name = name;
		s_grade = grade;
	}
	
	public void display() {
		System.out.println(s_id+" "+s_name+" "+s_grade );
	}
	
		

}
