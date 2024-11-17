package JavaPrograms;

public class WordCount {

	public static void main(String[] args) {
		String str = "I am a test engineer";
		int count = 0;
		
		char[] str2 = str.toCharArray();
		for (int i = 0; i < str2.length; i++) {
			if (str2[i] != ' ') {
				count ++;
			}
		}
		System.out.println(count);
	}

}
