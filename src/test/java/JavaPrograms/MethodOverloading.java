package JavaPrograms;

public class MethodOverloading {

	void sum(int x, int y) {
		System.out.println("sum(int x, int y): " + (x + y));
	}

	void sum(int x, double y) {
		System.out.println("sum(int x, double y): " + (x + y));
	}

	void sum(double x, int y) {
		System.out.println("sum(double x, int y) :" + (x + y));
	}

	void sum(double x, double y) {
		System.out.println("sum(double x, double y): " + (x + y));
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.sum(1.4, 1.3);
	}

}
