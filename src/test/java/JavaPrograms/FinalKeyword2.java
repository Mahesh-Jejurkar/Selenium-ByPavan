package JavaPrograms;

class Test1 
{
	final void m1() 
	{
		System.out.println("This is m1() from Test1.");
	}
}

class Test2 extends Test1
{
	 
	/*
	 * //Method can't be override in child class as it's declared as final. void
	 * m1() { System.out.println("This is m1() from Test2."); }
	 */	 
}

public class FinalKeyword2 
{
	public static void main(String[] args) 
	{
		
	}
}