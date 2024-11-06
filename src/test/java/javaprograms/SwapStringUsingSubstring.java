package javaprograms;

public class SwapStringUsingSubstring {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = null;
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		str3 = str1 + str2;
		System.out.println(str3);
		str1 = str3.substring(str1.length(),str3.length());
		str2 = str3.substring(0, str1.length());
		System.out.println("str1 = " +str1);
		System.out.println("str2 = " +str2);
	}

}
