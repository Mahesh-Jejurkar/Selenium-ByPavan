package JavaPrograms;

public class PrintOnlyNumberFromString {

	public static void main(String[] args) {
		String str1 = "123Mahesh@12356";
		String number = "";
		String character = "";
		String specialCharcter = "";

		char[] str2 = str1.toCharArray();

		for (int i = 0; i < str2.length; i++) {
			// System.out.println(str2[i]);
			if (Character.isDigit(str2[i])) {
				number += str2[i];
			}else
			if(Character.isAlphabetic(str2[i])) {
				character += str2[i];
			}else {
				specialCharcter += str2[i];
			}
		}
		
		System.out.println(number);
		System.out.println(character);
		System.out.println(specialCharcter);
		System.out.println(character.toUpperCase());
	}

}
