package javaprograms;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String - Immutable - cannot change
		String s = "Welcome";
		s.concat("to java programing");		
		System.out.println(s);
		
		//StringBuffer - mutable - can change
		StringBuffer s1 = new StringBuffer("Welcome");
		StringBuffer s2 = new StringBuffer("to java programing.");
		s1.append(s2);
		System.out.println(s1);
		System.out.println(s2);
		
		//StringBuilde - mutable - can change
		StringBuilder s11 = new StringBuilder("Welcome");
		StringBuilder s12 = new StringBuilder("to java programing.");
		s11.append(s12);
		System.out.println(s11);
		System.out.println(s12);
	}
}