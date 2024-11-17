package JavaPrograms;

public class CharCount {

	public static void main(String[] args) {
		String str = "Testing";

		int count = 0;
		char[] str2 = str.toCharArray();

		for (int i = 0; i < str2.length; i++) {
			char currentChar = str2[i];

			if (currentChar == 't' || currentChar == 'T') {
				count++;
			}
		}
		System.out.println("Count of T in :" + count);
	}

}
