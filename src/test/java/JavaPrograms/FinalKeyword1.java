package JavaPrograms;

class Test{
	//Value is constant and can't change at any cost.
	final int x=100; 
}

public class FinalKeyword1 {

	public static void main(String[] args) {
		Test obj_t = new Test();
		System.out.println(obj_t.x);
		
		/*
		 * Not possible as x is final variable.
		 * obj_t.x=200; 
		 * System.out.println(obj_t.x);
		 */
		
		
	}

}
