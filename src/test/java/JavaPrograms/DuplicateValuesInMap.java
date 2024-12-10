package JavaPrograms;

import java.util.*;

public class DuplicateValuesInMap 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> fruitMap = new HashMap<Integer, String>();
		fruitMap.put(1, "Apple");
		fruitMap.put(2, "Banana");
		fruitMap.put(3, "Mango");
		fruitMap.put(4, "Apple");
		fruitMap.put(5, "Grapes");
		fruitMap.put(6, "Mango");
		
		findDuplicates(fruitMap);
	}
	
	public static void findDuplicates(Map<Integer, String> map)
	{
		HashSet<String> seen = new HashSet<>();
		HashSet<String> duplicate = new HashSet<>();
		
		for(String value : map.values()) 
		{
			if(seen.contains(value))
			{
				duplicate.add(value);
			}
			else
			{
				seen.add(value);
			}	
		}
		
		if(duplicate.isEmpty()) {
			System.out.println("No duplicate values found.");
		}
		else
		{
			System.out.println("Duplicate values in the map:  "+duplicate);
		}
	} 
}


