package javaprograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(Arrays.asList(1, 10, 1, 2, 10));
		ArrayList list2 = new ArrayList(Arrays.asList("A", "B", "C", "A", "C"));
		ArrayList newList = removeDuplicate(list);
		ArrayList newList2 = removeDuplicate(list2);
		System.out.println(newList);
		System.out.println(newList2);
	}

	public static ArrayList removeDuplicate(ArrayList list) {
		ArrayList newList = new ArrayList();

		for (Object value : list) {
			if (!newList.contains(value)) {
				newList.add(value);
			}
		}
		return newList;
	}

}
