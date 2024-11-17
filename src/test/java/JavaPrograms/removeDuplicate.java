package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
	
	public static void main(String[] args) {
		System.out.println(removeDuplicateCharacter("Mahesh"));
	}
	
	public static String removeDuplicateCharacter(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			Character c = str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}

}
