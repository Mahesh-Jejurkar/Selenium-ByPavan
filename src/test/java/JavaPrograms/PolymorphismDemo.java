package JavaPrograms;

public class PolymorphismDemo {

	public static void main(String[] args) {
		int addtion1 = addition(2, 5);
		double addition2 = addition(2, 3.5);
		double addition3 = addition(2.8, 5.9, 2);
	
		System.out.println(addtion1);
		System.out.println(addition2);
		System.out.println(addition3);
	}
	
	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static double addition(int a, double b) {
		return a + b;
	}
	
	public static double addition(double a, double b, int c) {
		return a + b +c;
	}
	
}
