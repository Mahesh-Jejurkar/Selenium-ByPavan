package JavaPrograms;

public class CallByReferenec {
	int number;
	
	public void m1(CallByReferenec cr) {
		cr.number = cr.number + 10;
		System.out.println("Value in side the method: "+cr.number);
	}

	public static void main(String[] args) {
		CallByReferenec cr = new CallByReferenec();
		cr.number = 100;
		System.out.println("Value before method: "+cr.number);
		cr.m1(cr);
		System.out.println("Value after method: "+cr.number);
	}
}