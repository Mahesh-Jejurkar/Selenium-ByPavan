package javaprograms;

class Parent3{
	String name = "John";
	
	void m1() {
		System.out.println("This is m1() from parent..");
	}
}

class Child3 extends Parent3{
	int id=101;
	
	void m2() {
		System.out.println("This is m2() from child..");
	}
}


public class TypeCastingObject1 {

	public static void main(String[] args) {
		/*
		 * child3 c = new child3(); System.out.println(c.name);//Parent class variable.
		 * c.m1(); //Parent class method.
		 * 
		 * System.out.println(c.id);//Child class variable. c.m2();//Child class method.
		 */	
		
		/*
		 * //Upcasting => Parent class reference variable can hold child class object.
		 * Parent3 p = new child3(); System.out.println(p.name); p.m1(); p.id; //Not
		 * possible. p.m2; //Not possible.
		 */		
		
		//Downcasting
		Parent3 p = new Parent3();
		Child3 c = (Child3)p;
		System.out.println(c.name);//Parent
		c.m1();//Parent
		
		System.out.println(c.id);//child
		c.m2();//child
	}

}
