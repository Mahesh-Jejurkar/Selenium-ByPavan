package JavaPrograms;

public class OverloadingMainMethod {

	public static void main(String[] args) {
		OverloadingMainMethod m = new OverloadingMainMethod();
		OverloadingMainMethod.main(2);
	}

	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(double  a, double b) {
		System.out.println(a+b);
	}
}
