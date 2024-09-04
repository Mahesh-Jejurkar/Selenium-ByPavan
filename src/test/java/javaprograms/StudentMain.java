package javaprograms;

public class StudentMain {

	public static void main(String[] args) {
		//Student st = new Student(102, "Dhruv Jejurkar", 'C');
		Student st = new Student();
		st.display();
		
		//Assign data using object reference
		st.s_id = 100;
		st.s_name = "Mahesh Jejurkar";
		st.s_grade = 'A';
		st.display();
		
		//Assign data using user defined method
		st.setData(101, "Sagar Baba", 'B');
		st.display();
		
	}
}