package javaprograms;

public class StringMethods2 {

	public static void main(String[] args) {
		String s1 = "John Kenedy";
		System.out.println(s1.toLowerCase().contains("john"));
		System.out.println(s1.replace("J", "j").contains("john"));
		
		System.out.println(s1);
	}
}