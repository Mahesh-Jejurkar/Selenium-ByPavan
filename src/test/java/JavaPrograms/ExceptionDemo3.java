package JavaPrograms;

import java.util.Scanner;

public class ExceptionDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Program is started...");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * //Example:1 
		 * System.out.println("Enter a number: "); 
		 * int n1 = sc.nextInt(); 
		 * double result = 100/n1; //ArithmeticException 
		 * System.out.println(result);
		 */
		 
		
		
		/*
		 * //Example:2 int[] a = new int[5];
		 * System.out.println("Enter the position(0-4): "); int pos = sc.nextInt();
		 * System.out.println("Enter the value: "); int value = sc.nextInt(); a[pos] =
		 * value;//ArrayIndexOutOfBoundsException
		 * System.out.println("Entered value: "+a[pos]);
		 */

		/*
		 * //Example:3 
		 * String s = "Welcome"; 
		 * int num = Integer.parseInt(s); //NumberFormatException 
		 * System.out.println(num);
		 */
		
		String s=null;
		System.out.println(s.length()); //NullPointerException
		
	    System.out.println("Program is completed...");	    
	}

}
