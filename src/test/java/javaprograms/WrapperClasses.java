package javaprograms;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		// Primitive
		int a = 10;
		double b = 21.23;
		char ch = 'A';
		boolean status = true;

		// Converting primitive to object => Auto boxing.
		Integer aa = a;
		Double bb = b;
		Character cc = ch;
		Boolean dd = status;

		ArrayList<Object> al = new ArrayList<Object>();
		al.add(aa);
		al.add(bb);
		al.add(cc);
		al.add(dd);
		System.out.println(al);

		// Converting Object to Primitive => Unboxing.
		int value = aa;
		System.out.println(value);
	}

}
