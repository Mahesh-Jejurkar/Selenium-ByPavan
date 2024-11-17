package JavaPrograms;

public class StringUpperAndLowerChar {

	public static void main(String[] args) {
		String str1 = "MaHEsh BhaNUDas JejURkar";
		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (Character.isLowerCase(ch)) {
				str2 += Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch)) {
				str2+=Character.toLowerCase(ch);
			}
			else {
				str2+=ch;
			}
		}
		System.out.println(str2);
	}

}
