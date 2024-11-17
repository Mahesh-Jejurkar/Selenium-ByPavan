package JavaPrograms;

public class ReadTheStringInReverseOrder {

	public static void main(String[] args) {
		String str = "Welcome to java world";

		String array[] = str.split(" ");
		System.out.println(array.length);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}

	}
}
