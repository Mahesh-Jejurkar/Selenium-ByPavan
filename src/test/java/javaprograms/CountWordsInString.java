package javaprograms;

public class CountWordsInString {

	public static void main(String[] args) {
		String s = "I am test engineer.";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			s.charAt(i);
			count ++;
		}
		System.out.println(count);
		
	}
}
