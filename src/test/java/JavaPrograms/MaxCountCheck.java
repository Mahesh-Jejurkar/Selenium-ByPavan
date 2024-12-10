package JavaPrograms;

import java.util.HashMap;

public class MaxCountCheck 
{
	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 1, 2, 3, 4, 4, 4, 5 };
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			count = 1;
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] == a[j]) 
				{
					count++;
					map.put(a[i], count);
					a[j] = '\0';
				}
			}

			if (a[i] != 0) 
			{
				System.out.println(a[i] + " count: " + count);
			}
		}
		System.out.println(map);
		int temp = 0;
		int key = 0;
		int value = 0;

		for (var entry : map.entrySet()) 
		{
			// System.out.println(entry.getKey() + ":" + entry.getValue());
			temp = 0;
			value = entry.getValue();

			if (value > temp) 
			{
				temp = value;
				key = entry.getKey();
			}
		}

		System.out.println(key + " has max count in array: " + temp);
	}
}
