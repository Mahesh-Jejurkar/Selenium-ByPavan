package javaprograms;

class Counter{
	static int count = 0;
	
	Counter(){
		count++;
	}
	
	int getCount() {
		return count;
	}
}





public class StaticVariables {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		System.out.println(c1.getCount());
		
		Counter c2 = new Counter();
		System.out.println(c2.getCount());
	}

}
