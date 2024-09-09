package javaprograms;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		System.out.println("Program is started...");
		Scanner sc = new Scanner(System.in);

		// Example:1
		System.out.println("Enter a number: ");
		int n1 = sc.nextInt();
		try {
			double result = 100 / n1; // ArithmeticException
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Invalid data.");
			System.out.println(e);
		}

		System.out.println("Program is completed...");
	}

}
