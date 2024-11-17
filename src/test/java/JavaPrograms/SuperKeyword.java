package JavaPrograms;

class Animal{
	String color = "White";
	
	public Animal() {
		System.out.println("This is a animal class...");
	}
	
	public Animal(String name) {
		System.out.println("This is a animal class: "+name);
	}
	
	void eat() {
		System.out.println("Animals does eating...");
	}
}

class Dog extends Animal{
	String color = "Black";
	
	Dog() {
		super();
		System.out.println("This is dog class...");
	}
	
	Dog(String name) {
		super(name);
		System.out.println("This is dog class: "+name);
	}
	
	void displayColor() {
		System.out.println(super.color);
	}
	
	void eat() {
		super.eat();
		System.out.println("Dogs does eating of bread...");
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog("Garman Spheffers");
		//d.displayColor();
		//d.eat();
	}
}
