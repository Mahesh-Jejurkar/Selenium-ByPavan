package JavaPrograms;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String s = "selenium";
		String reverse_string = "";

		/*
		 * // Method_1 for (int i = s.length() - 1; i >= 0; i--) { reverse_string =
		 * reverse_string + (s.charAt(i)); } System.out.println(reverse_string);
		 */

		/*
		 * //Method_2 char[] array_s = s.toCharArray();
		 * System.out.println(Arrays.toString(array_s)); for(int i=array_s.length-1;
		 * i>=0; i--) { reverse_string = reverse_string+array_s[i]; }
		 * System.out.println(reverse_string);
		 */
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}