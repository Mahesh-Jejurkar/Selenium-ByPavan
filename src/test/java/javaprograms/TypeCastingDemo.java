package javaprograms;

//Upcasting - Converting value from smaller to larger. => Automatic process.
//i.e. int -> long
// float -> double

//Downcasting - Converting value from larger to smaller. => Explicitly / manual process.
//i.e long -> int
// double -> float

public class TypeCastingDemo {

	public static void main(String[] args) {
		//Upcasting => Automatic => smaller to larger
		int intvalue = 100;
		int longvalue = intvalue;
		System.out.println(longvalue);
		
		float floatvalue = 10.25F;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		//Downcasting => manually => larger to smaller
		long longvalue2 = 1000000000;
		int intvalue2 = (int)longvalue2;
		System.out.println(intvalue2);
		
		double doublevalue2 = 125.23;
		float floatvalue2 = (float)doublevalue2;
		System.out.println(floatvalue2);
		
		//Example1
		double doublevalue3 = 235.56;
		int intvalue3 = (int)doublevalue3;
		System.out.println(intvalue3);
	}

}
