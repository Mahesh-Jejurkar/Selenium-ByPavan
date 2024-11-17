package JavaPrograms;

public class ReverseStringRemoveSpecialChar {

	public static void main(String[] args) {
		String str1 = "I\"Love\"India\"";
		char[] str2 = str1.toCharArray();
		
		for(int i=str2.length-1; i>=0; i--) {
			
			if(str2[i]=='"') {
				System.out.print(" ");
			}
			
			if(str2[i]=='"') {
				continue;
			}
			System.out.print(str2[i]);
		}
	}
}
