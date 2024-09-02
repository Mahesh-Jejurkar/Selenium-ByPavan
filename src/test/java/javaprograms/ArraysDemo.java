package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = { 12, 13, 23, 45 };
		System.out.println(b[2]);

		int[][] c = new int[3][2];
		System.out.println(b.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		for (int value : b) {
			System.out.println(value);
		}

		System.out.println("--------------------------------------");

		int k[][] = { { 10, 20, 35 }, { 40, 55, 60 }, { 75, 80, 90 } };

		int sum = 0;
		int countENo = 0;
		int countONo = 0;
		int oddNo[] = new int[k.length * k[0].length];
		int evenNo[] = new int[k.length * k[0].length];

		for (int value[] : k) {
			for (int value2 : value) {
				if (value2 % 2 == 0) {
					evenNo[countENo] = value2;
					countENo++;
				} else {
					oddNo[countONo] = value2;
					countONo++;
				}
				sum = sum + value2;
				System.out.print(value2 + " ");
			}
			System.out.println();
		}

		System.out.println("Sum of array values : " + sum);
		System.out.println("Even no. array : "+Arrays.toString(evenNo));
		System.out.println("Even no. array : "+Arrays.toString(oddNo));
	}
}
