package JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set.*;

public class HashMapDemo3 
{
	public static void main(String[] args) 
	{
		//Declaration
		//HashMap hm = new HashMap();	Allows heterogeneous data
		
		//Allows only specified type of data.
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");
		
		//Getting the size of hashmap
		System.out.println(hm.size());
		
		//Printing hashmap
		System.out.println(hm);
		
		//Remove specific pair
		hm.remove(103);
		System.out.println("After removing the pair: "+hm);
		
		//Print the value of key
		System.out.println(hm.get(102));
		
		//Get all the keys from hashmap
		System.out.println(hm.keySet());//[101, 102, 104]
		
		//Get all the values from hashmap
		System.out.println(hm.values());//[John, David, Scott]
		
		//Get key and value pair
		System.out.println(hm.entrySet());
		
		//Reading data from hashmap
		//Using for each loop
		for(int k : hm.keySet()) 
		{
			System.out.println(k+" "+hm.get(k));
		}
		
		//Using iterator
		System.out.println("Iterator way of printing: ");
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());
	}

}
