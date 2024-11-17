package JavaPrograms;

public class StringReverse2 {

	public static void main(String[] args) {
		
		String str1 = "My name is Mahesh";
		
		int length = str1.length();
		
		for(int i=length-1; i>=0; i--) {
			System.out.print(str1.charAt(i));
		}

	}

}
