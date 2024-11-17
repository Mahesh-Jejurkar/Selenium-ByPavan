package JavaPrograms;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration
		HashSet<Object> myset = new HashSet<Object>();
		//Set<Object> st = new HashSet<Object>();
		
		//Adding elements in to the hashset.
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing hashset
		System.out.println("Orignal hashset: "+myset);//[null, A, 100, 10.5, Welcome, true]
		
		//Size of hashset
		System.out.println("Size of hashset: "+myset.size());
		
		//Removing specific element from set. Pass value.
		myset.remove(10.5); 
		System.out.println("After removing: "+myset);//[null, A, 100, Welcome, true]
		
		//Inserting element - Not possible.
		//Access specific element - Not possible.
		
		//Convert HashSet --> ArrayList
		ArrayList<Object> al = new ArrayList<Object>(myset);
		System.out.println("ArrayList: "+al);//[null, A, 100, Welcome, true]
		System.out.println(al.get(2));
		
		//Read all the elements using foreach loop
		/*
		 * for(Object s : myset) { System.out.println(s); }
		 */
		
		//Read all the elements using iterator.
		Iterator<Object> it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
