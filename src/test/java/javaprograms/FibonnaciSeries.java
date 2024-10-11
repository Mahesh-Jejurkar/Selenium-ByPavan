package javaprograms;

public class FibonnaciSeries {

	public static void main(String[] args) {

		int n = 10;
		int firstNo = 0;
		int secondNo = 1;
		System.out.println("No. of iteration: " + n);

		for (int i = 1; i <= 10; i++) {
			System.out.print(firstNo + " ");
			int newno = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = newno;
		}
	}

}
