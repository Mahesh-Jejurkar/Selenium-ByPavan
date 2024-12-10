package JavaPrograms;

class Animal2
{
	
}

class Dog2 extends Animal2
{
	
}

class Cat2 extends Animal2
{
	
}

public class TypeCastingObject2 
{
	public static void main(String[] args) 
	{
		Animal2 an = new Dog2();
		Dog2 dg = (Dog2)an;
	}
}
