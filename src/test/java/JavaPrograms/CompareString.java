package JavaPrograms;

public class CompareString {

	public static void main(String[] args) {
		System.out.println(compareString("Mahesh", "MAHESH"));
	}

	public static String compareString(String str1, String str2) {
		String result = "false";
		int str1Length = str1.length();
		int str2Length = str2.length();

		if (!(str1Length == str2Length)) {
			result = "Two string are not identical.";
		} else {
			for (int i = 0; i < str1.length(); i++) {
				char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(i);
				if (ch1 == ch2) {
					result = "true";
				} else {
					break;
				}
			}
		}
		return result;
	}
}
