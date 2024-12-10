package JavaPrograms;

public class DataConversion 
{
	public static void main(String[] args) 
	{
		// Cann't convert to Integer...
		String s1 = "Welcome";
		
		//Scenario 1 - String to -> int, double, boolean, char	=> Unboxing
		String s2 = "150";
		String s3 = "200";
		// s2+s3 not possible
		int sum = Integer.parseInt(s2) + Integer.parseInt(s3);
		System.out.println(sum);
		
		String s4 = "125.236";
		String s5 = "456.125";
		double sum2 = Double.parseDouble(s4) + Double.parseDouble(s5);
		System.out.println(sum2);
		
		String s6 = "true";
		boolean status = Boolean.parseBoolean(s6);
		System.out.println(status);
		
		//String to -> char not possible
		String s7 = "A";
		
		
		//Scenario 2 - int, double, boolean, char to -> String	=> Auto Boxing
		int i = 100, j = 200;
		String s = String.valueOf(i);
		String ss =	String.valueOf(200);
		System.out.println(s+ss);
		
		double d = 42.021;
		String dd =	String.valueOf(d);
		
		boolean result = true;
		String s_result = String.valueOf(result);
		System.out.println(s_result);
		
		char chh = 'a';
		String s_chh = String.valueOf(chh);
		System.out.println(s_chh);
		
		//Scenario 3 -
		//int -> double
		int x = 10;
		double d1 = x;
		System.out.println(d1);
		
		//double -> int
		double y = 20.35;
		int ii = (int) y;	//Type casting
		System.out.println(ii);	//20
	}
}
