package JavaPrograms;

public class StringFindUppercaseLetter {

	public static void main(String[] args) {
		String s = "Welcome To Java";
		int upper = 0;
		int lower = 0;

		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			}
		}

		System.out.println("Count of upper case char: " + upper);
		System.out.println("Count of lower case char: " + lower);
	}
}