package javaprograms;

public class ArrayFindDublicate {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,10,70,20,90};
		
		for(int i=0; i<a.length; i++) {
			int count = 0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(a[i] +" found "+count+ " times.");
			}
		}
	}

}
