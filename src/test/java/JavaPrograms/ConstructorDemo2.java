package JavaPrograms;

public class ConstructorDemo2 
{
	int value1;
	int value2;

	ConstructorDemo2() 
	{
		value1 = 10;
		value2 = 20;
		System.out.println("Inside the 1st constructor...");
	}

	ConstructorDemo2(int a) 
	{
		value1 = a;
		System.out.println("Inside the 2nd constructor...");
	}

	ConstructorDemo2(int a, int b) 
	{
		value1 = a;
		value2 = b;
		System.out.println("Inside the 3rd constructor...");
	}

	public void display() 
	{
		System.out.println("Value1 : " + value1);
		System.out.println("Value2 : " + value2);
	}

	public static void main(String[] args) 
	{
		ConstructorDemo2 sc1 = new ConstructorDemo2();
		ConstructorDemo2 sc2 = new ConstructorDemo2(30);
		ConstructorDemo2 sc3 = new ConstructorDemo2(40, 50);
		sc1.display();
		sc2.display();
		sc3.display();
	}
}