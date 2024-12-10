package JavaPrograms;

import java.util.Arrays;

public class AnagramString 
{
	public static void main(String[] args) 
	{
		String s1 = "listen";
		String s2 = "silent";
		
		boolean result = toTestAnagramString(s1, s2);
		
		if(result==true) 
		{
			System.out.println("Two strings are anagram...");
		}
		else
		{
			System.out.println("Two strings are not anagram...");
		}
	}

	public static boolean toTestAnagramString(String str1, String str2) 
	{		
		if(str1.length()!=str2.length()) 
		{
			return false;
		}
		
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		return Arrays.equals(str1Array, str2Array);
	}
}

