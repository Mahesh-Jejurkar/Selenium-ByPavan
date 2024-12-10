package JavaPrograms;

import java.util.Scanner;

public class FactorialOfNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial: ");
		int number = sc.nextInt();
		sc.close();
		
		int factorial = factorial(number);
		System.out.println("Factorial of given no.: "+factorial);
	}
	
	public static int factorial(int n) 
	{
		int result = 1;
		
		for(int i=1; i<=n; i++) 
		{
			result*=i;
		}
		return result;
	}
}
