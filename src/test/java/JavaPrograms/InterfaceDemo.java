package JavaPrograms;

interface Shape
{
	int length=10, width=20, height=30;
	
	void circle();
	
	default void square() 
	{
		System.out.println("This is square - default method...");
	}
	
	static void rectangle() 
	{
		System.out.println("This is rectangle - static method...");
	}
}

public class InterfaceDemo implements Shape 
{
	@Override
	public void circle() 
	{
		System.out.println("This is cricel abstract method.");
	}
	
	void triangle() 
	{
		System.out.println("This is triangle.");
	}
	
	
	public static void main(String[] args) 
	{
		InterfaceDemo obj_id = new InterfaceDemo();
		obj_id.triangle();
		obj_id.circle();	//abstract method.
		obj_id.square();	//default method.
		Shape.rectangle();	//Static method.
		System.out.println(Shape.width);//Correct way.
		System.out.println(obj_id.length);//It would be best practice to access static variables and methods in static way. i.e. Shape.lenght
		System.out.println(obj_id.height);//It would be best practice to access static variables and methods in static way. i.e. Shape.height
		
		
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
	}
}
