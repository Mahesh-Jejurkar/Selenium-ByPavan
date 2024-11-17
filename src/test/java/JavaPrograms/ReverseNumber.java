package JavaPrograms;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(reverseNumber(1234));
	}
	
	public static int reverseNumber(int n) {
		int remainder = 0;
		int reverse = 0;
		
		while(n > 0) {
			remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n = n / 10;
		}
		return reverse;
	}
}
