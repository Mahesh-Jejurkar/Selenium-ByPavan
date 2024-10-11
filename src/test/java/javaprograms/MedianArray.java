package javaprograms;

import java.util.Arrays;

public class MedianArray {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println(findMedian(a));
		
//		int n = a.length;
//		System.out.println((a[n/2] + a[n/2-1])/2);
	}
	
	public static double findMedian(int[] array) {
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int n=array.length;
		
		if(n%2==1) {
			return array[n/2];
		}else {
			return ((array[n/2] + array[n/2-1])/2);
		}
		
	}
}
