package JavaPrograms;

public class IfElseIfCondition {

	public static void main(String[] args) {
		int person_age = -15;
		
		if(person_age<=0) {
			System.out.println("Invalid age...");
		}
		else if(person_age >=18) {
			System.out.println("Eligible for voting...");
		}
		else {
			System.out.println("Not eligible for voting...");
		}

	}
}
