package JavaPrograms;

public class StringDemo {

	public static void main(String[] args) {
		String s = new String("Mahesh Jejurkar Engineer");
		System.out.println(s);

		String[] newString = s.split(" ");
		for (int i = 0; i < newString.length; i++) {
			System.out.println(newString[i]);
		}

		String[] newString2 = s.split("Jejurkar");
		System.out.println(newString2[0]);
		System.out.println(newString2[1]);

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
