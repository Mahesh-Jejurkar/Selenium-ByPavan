package JavaPrograms;

public class CharCount2 {

	public static void main(String[] args) {
		String str1 = "Testing";
		int count =0;
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)=='t' || str1.charAt(i)=='T') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
