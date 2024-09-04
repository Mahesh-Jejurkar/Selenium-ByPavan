package javaprograms;

public class CallByValue {

	public void m1(int number) {
		number = number + 10;
		System.out.println("Value of number in a method m1: " + number);
	}

	public static void main(String[] args) {
		CallByValue cv = new CallByValue();

		int number = 100;
		System.out.println("Before passing to method value of number: " + number);
		cv.m1(number);

		System.out.println("After passing to method value of number: " + number);
	}
}