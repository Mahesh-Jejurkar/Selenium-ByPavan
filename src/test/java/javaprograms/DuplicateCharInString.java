package javaprograms;

public class DuplicateCharInString {

	public static void main(String[] args) {
		int count;
		String str1 = "Test Engineer";
		char[] str2 = str1.toCharArray();

		for (int i = 0; i < str2.length; i++) {
			count = 1;
			for (int j = i + 1; j < str2.length; j++) {
				if (str2[i] == str2[j] && str2[i] != ' ') {
					count++;
					str2[j]='0';
				}
			}
			
			if(count > 1 && str2[i]!='0') {
				System.out.println(str2[i]);
			}
		}

	}

}
