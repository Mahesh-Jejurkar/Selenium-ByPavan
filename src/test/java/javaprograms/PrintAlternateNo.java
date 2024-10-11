package javaprograms;

public class PrintAlternateNo {

	public static void main(String[] args) {
		
		int no[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<no.length; i=i+2) {
			System.out.println(no[i]);
		}

	}
}
