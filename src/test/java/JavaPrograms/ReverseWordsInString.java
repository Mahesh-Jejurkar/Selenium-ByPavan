package JavaPrograms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "Welcome to java world";

		String array[] = str.split(" ");
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			String temp = array[i];
			int length = temp.length();

			for (int j = length - 1; j >= 0; j--) {
				System.out.print(temp.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
