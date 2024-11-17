package JavaPrograms;

public class FactorailOfNumber {
	public static void main(String[] args) {
		System.out.println(factorialOfNumber(5));
	}

	public static int factorialOfNumber(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++) {
			res = res * i;
		}
		return res;
	}
}