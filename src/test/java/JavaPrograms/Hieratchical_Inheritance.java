package JavaPrograms;

class parent 
{
	void display(int a) 
	{
		System.out.println("Parent class: " + a);
	}
}

class child1 extends parent 
{
	void show(int a) 
	{
		System.out.println("Child_1 class: " + a);
	}
}

class child2 extends parent 
{
	void print(int b) 
	{
		System.out.println("Child_2 class: " + b);
	}
}

public class Hieratchical_Inheritance 
{
	public static void main(String[] args) 
	{
		child1 ch1 = new child1();
		ch1.show(12);

		child1 ch2 = new child1();
		ch2.display(14);

		parent pr = new child1();
		pr.display(12);

	}
}


