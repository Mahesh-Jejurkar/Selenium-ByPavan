package javaprograms;

import java.util.*;

public class FindDuplicateValues {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "Apple");
		map.put(5, "Grapes");
		
		findDuplicates(map);
	}
	
	public static void findDuplicates(Map<Integer, String> map) {
		Set<String> uniqueValues = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		
		for(String value : map.values()) {
			if(!uniqueValues.add(value)) {
				duplicates.add(value);
			}
		}


	if(duplicates.isEmpty()) {
		System.out.println("No duplicate found...");
		
	}else {
		System.out.println("Duplicate values:" +duplicates);
	}
	
	}
}
