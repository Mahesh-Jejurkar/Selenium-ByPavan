package JavaPrograms;

public class PrintA 
{
	public static void main(String[] args) 
	{
		String str1 = "Madam";
		char[] str2 = str1.toCharArray();
		int count = 0; 
		
		for(char ch : str2) 
		{
			if(ch == 'a' || ch == 'A') 
			{
				count ++;
			}
		}
		System.out.println(count);
	}
}
