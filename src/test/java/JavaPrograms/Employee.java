package JavaPrograms;

public class Employee {

	int eid, salary;
	String ename, job;
	
	void display() {
		System.out.println(eid+" "+ename+" "+job+" "+salary);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.eid = 1;
		emp1.ename = "Mahesh Jejurkar";
		emp1.salary = 80000;
		emp1.job = "Test Engineer";
		emp1.display();
		
		
		Employee emp2 = new Employee();
		emp2.eid = 2;
		emp2.ename = "Dhruv Jejurkar";
		emp2.salary = 90000;
		emp2.job = "Software Engineer";
		emp2.display();
	}
}