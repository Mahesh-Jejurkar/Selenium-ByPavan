package JavaPrograms;

public class CountWordsInString {

	public static void main(String[] args) {
		String s = "I am test @engi#neer";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLetter(ch)) {
				count ++;
			}
		}
		System.out.println(count);
		
	}
}
