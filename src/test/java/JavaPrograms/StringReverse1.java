package JavaPrograms;

public class StringReverse1 {

	public static void main(String[] args) {
		
		String str1 = "i am mani";
		String[] str2 = str1.split(" ");
		
		
		for(int i=0; i<str2.length; i++) {
			String temp = str2[i];
			char[] tempArray = temp.toCharArray();
			
			for(int j=tempArray.length-1; j>=0; j--) {
				System.out.print(tempArray[j]);
			}
			System.out.print(" ");
		}

	}

}
