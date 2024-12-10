package JavaPrograms;

import java.util.*;

public class DuplicateValueFromStringArray 
{
	public static void main(String[] args) 
	{
		String[] names = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};
		
		Set<String> uniqueElements = new HashSet<String>();
		Set<String> duplicates = new HashSet<String>();
		
		for(String name : names) 
		{
			if(!uniqueElements.add(name)) 
			{
				duplicates.add(name);
			}
		}
		if(duplicates.isEmpty()) 
		{
			System.out.println("No duplicate found.");
		}
		else 
		{
			System.out.println("Duplicates: "+duplicates);
		}
	}
}
