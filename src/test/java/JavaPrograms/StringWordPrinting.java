package JavaPrograms;

public class StringWordPrinting {

	public static void main(String[] args) {
		String str1 = "a3b12";
		
		char[] str2 = str1.toCharArray();
		
		for(int i=0; i<str2.length; i++) {
			System.out.println(str2[i]);
		}

	}

}
