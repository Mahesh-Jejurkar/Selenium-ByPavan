package JavaPrograms;

public class FindCharNoSpecialChar {

	public static void main(String[] args) {
		String email = "mahesh1221.jejurkar132@gmail.com";
		String letter = "";
		String number = "";
		String specialChar = "";

		char[] array = email.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (Character.isLetter(array[i])) {
				letter += array[i];
			} else if (Character.isDigit(array[i])) {
				number += array[i];
			} else {
				specialChar += array[i];
			}
		}

		System.out.println("Letters: " + letter);
		System.out.println("Number: " + number);
		System.out.println("Special Characters: " + specialChar);
	}

}
