package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		System.out.println(removeDuplicateCharacter("Mahesh"));
	}
	
	public static String removeDuplicateCharacter(String str) {
		Set<Character> set = new HashSet<>();
		String str2 = "";
		
		for(int i=0; i<str.length(); i++) {
			Character ch = str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				str2+=ch;
			}
		}
		return str2;
	}
}