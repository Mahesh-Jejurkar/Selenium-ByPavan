package JavaPrograms;

public class DuplicateCharsInString 
{
	public static void main(String[] args) 
	{
		displayDuplicateCharsInString("Maheshma");
	}

	public static void displayDuplicateCharsInString(String s) 
	{
		int count = 0;
		char[] s2 = s.toCharArray();
		
		for(int i=0; i<s2.length; i++) 
		{
			count = 1;
			for(int j=i+1; j<s2.length; j++)
			{
				if(s2[i]==s2[j] && s2[i]!=' ') 
				{
					count ++;
					s2[j] = '0';
				}
			}
			
			if(count > 1 && s2[i]!='0') 
			{
				System.out.println(s2[i]);
			}
		}
	}
}
