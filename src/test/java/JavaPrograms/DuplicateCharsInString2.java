package JavaPrograms;

import java.util.*;

public class DuplicateCharsInString2 
{

	public static void main(String[] args) 
	{
		printCountOfDuplicateCharInString("Mahesh Jejurkar");
	}
	
	public static void printCountOfDuplicateCharInString(String s)
	{
		Map<Character, Integer> data = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(data.containsKey(ch))
			{
				data.put(ch, data.get(ch) + 1);
			}
			else
			{
				data.put(ch, 1);
			}
		}
		System.out.println(data);
	}
}

