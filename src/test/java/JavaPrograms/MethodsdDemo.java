package JavaPrograms;

public class MethodsdDemo 
{
	public static void main(String[] args) 
	{
		MethodsdDemo st = new MethodsdDemo();
		String rtString = st.ss();
		System.out.println(rtString);

		ss2();
	}

	public String ss() 
	{
		System.out.println("Method ss() executed...");
		return "Mahesh JK";
	}

	public static void ss2() 
	{
		System.out.println("Methos ss2() executed...");
	}
}
