package javaprograms;

class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	//Overriding
	void m1(int a) {
		System.out.println(a*a);
	}
	
	//Overriding
	void m2(int b) {
		System.out.println(b*b*b);
	}
	
	//Overloading
	void m2(int a, int b) {
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		XYZ obj_xyz = new XYZ();
		obj_xyz.m1(10);
		obj_xyz.m2(20, 20);
	}

}
