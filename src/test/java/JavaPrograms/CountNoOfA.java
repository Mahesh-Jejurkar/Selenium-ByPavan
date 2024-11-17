package JavaPrograms;

public class CountNoOfA {
	public static void main(String[] args) {
		System.out.println(countNoOfA("AMAHESHA AMAHESHA"));
	}

	public static int countNoOfA(String str) {
		int count = 0;
		char[] str2 = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if(str2[i]=='A') {
				count ++;
			}
		}
		return count;
	}
}
