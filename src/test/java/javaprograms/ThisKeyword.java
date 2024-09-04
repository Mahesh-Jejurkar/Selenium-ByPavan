package javaprograms;

public class ThisKeyword {
	int x, y;	//Class variables / instance variables.
	
	//here a and b are local variables. 
	/*
	 * void setData(int a, int b) { x=a; y=b; }
	 */
	
	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x+"\t"+y);
	}
	
	public static void main(String[] args) {
		ThisKeyword obj1 = new ThisKeyword();
		obj1.setData(10, 20);
		obj1.display();

	}
}