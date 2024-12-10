package JavaPrograms;

interface t1
{
	int x=100;
	void m1();
} 

interface t2
{
	int y=200;
	void m2();
}

public class MultipleInheritance implements t1, t2
{
	@Override
	public void m2() 
	{
		System.out.println("This is m2()...");
	}

	@Override
	public void m1() 
	{
		System.out.println("This is m1()...");
	}

	public static void main(String[] args) 
	{
		MultipleInheritance mi = new MultipleInheritance();
		mi.m1();
		mi.m2();
		
		System.out.println(mi.x);
		System.out.println(mi.y);
	}
}
