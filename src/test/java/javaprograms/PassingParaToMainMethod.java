package javaprograms;

public class PassingParaToMainMethod {

	public static void main(String[] a) {
		System.out.println(a.length);
		System.out.println();
		for(String s : a) {
			System.out.println(s);
		}
	}
}