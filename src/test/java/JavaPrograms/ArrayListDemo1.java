package JavaPrograms;

import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// ArrayList<Integer> al = new ArrayList<Integer>();
		// List l1 = new ArrayList<>();
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(100);
		al.add(10.5);
		al.add("Welcome");
		al.add("A");
		al.add(true);
		al.add(100);
		al.add(null);
		al.add(null);

		// Size of arraylist.
		System.out.println("The size of an arraylist: " + al.size());// 8

		// Printng the arraylist
		System.out.println("Printing data from arraylist: " + al);// [100, 10.5, Welcome, A, true, 100, null, null]

		// Clone of arraylist
		Object cloned_array = al.clone();
		System.out.println("Cloned arraylist: " + cloned_array);

		// Remove element from arraylist
		al.remove(5);
		System.out.println("After removing: " + al);// [100, 10.5, Welcome, A, true, null, null]

		// Insert element in the arraylist
		al.add(2, "Java");
		System.out.println("After insertion: " + al);// [100, 10.5, Java, Welcome, A, true, null, null]

		// Modify element in the arraylist(modify/replace/change)
		al.set(2, "Python");
		System.out.println("After replacing: " + al);// [100, 10.5, Python, Welcome, A, true, null, null]

		// Access specific element from arraylist
		System.out.println(al.get(3));// Welcome

		// Removing all the elements from arraylist
		// Using normal for loop.
		/*
		 * for(int i=0; i<al.size(); i++) { System.out.println(al.get(i)); }
		 */

		// Using for each loop.
		/*
		 * for(Object x : al) { System.out.println(x); }
		 */

		// Using iterator
		Iterator<Object> it = al.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();

		// Checking the arraylist is empty or not.
		System.out.println("Is arraylist empty? " + al.isEmpty());

		// Remove the specific elements from array list through index.
		al.remove(1);
		System.out.println(al);

		// Remove the specific element from array list through name;
		al.remove("Welcome");
		System.out.println(al);

		ArrayList<Object> al2 = new ArrayList<Object>();
		al2.add(100);
		al2.add("Python");
		al2.add(50.50);
		System.out.println(al2);

		// Removing collection of element from arraylist.
		al.removeAll(al2);
		System.out.println(al);

		// Remove all the elements from arraylist.
		al.clear();
		System.out.println(al);
	}

}
