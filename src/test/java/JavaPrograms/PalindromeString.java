package JavaPrograms;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String s1 = "madam";
		String s2 = "";
		
		for(int i = s1.length()-1; i >= 0; i--) 
		{
			s2 = s2 + (s1.charAt(i));
		}

		if(s2.equals(s1)) 
		{
			System.out.println("String is palindrom.");
		}
		else 
		{
			System.out.println("String is not palindrom.");
		}
		
		System.out.println("String s1: "+s1);
		System.out.println("String s2: "+s2);
	}
}
