package JavaPrograms;

public class StringOperations {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		int lenght = str1.length();
		System.out.println(lenght);
		String strSubtring = str1.substring(0, 5);
		System.out.println(strSubtring);
		
		boolean result = str1.equals(str2);
		System.out.println(result);
		
		if(str1==str2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

		
		System.err.println(str1.toLowerCase());
		System.err.println(str2.toUpperCase());
		System.out.println(Character.isUpperCase(str1.charAt(0)));
		System.out.println(Character.isLowerCase(str1.charAt(0)));
		
		String str3 = "Hello World".replace("World", "Java");
		System.out.println(str3);
		
		boolean result2 = str1.contains("ll");
		System.out.println(result2);
		
		int indexOfH = str1.indexOf("H");
		System.out.println(indexOfH);
		
		
		String name = "Mahesh Jejurkar Software Test Engineer";
		String[] arrayString = name.split(" ");
		
		for(int i=0; i<arrayString.length; i++) {
			String currentString = arrayString[i];
			for(int j=currentString.length()-1; j>=0; j--) {
				System.out.print(currentString.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
