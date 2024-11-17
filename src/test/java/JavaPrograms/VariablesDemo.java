package JavaPrograms;


public class VariablesDemo {

	public static void main(String[] args) {
		char grade = 'A';
		String grade2 = "A";
		System.out.println(grade);
		System.out.println(grade2);
		
		byte a = -128;
		System.out.println(a);
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x||y);
		System.out.println(x&&y);
		
		boolean b1=10<20;
		System.out.println(b1);
		
		
		int b=10;
		b++;
		System.out.println(b);
		
		
		int c=10;
		int res2=++c;
		System.out.println(res2);
		System.out.println(++c);
		
		int d=200;
		int e=100;
		
		int res=(d>e)?d:e;
			
		System.out.println(res);
		
		int age=10;
		
		String vote=(age>18)?"Eligible":"Not Eligible";
		System.out.println(vote);
		
	}
}