package javaprograms;

public class EvenOrOddNo {

	public static void main(String[] args) throws Exception {
		for (int no = 1; no <= 10; no++) {
			Thread.sleep(500);
			if (no % 2 == 0) {
				System.out.println(no + " is even no.");
			} else {
				System.out.println(no + " is odd no.");
			}
		}	
	}
}
