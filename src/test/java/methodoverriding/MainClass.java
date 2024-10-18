package methodoverriding;

public class MainClass {

	public static void main(String[] args) {
		Parent p;
		
		p = new Child1();
		p.display();
		
		p = new Child2();
		p.display();
		
		p = new Parent();
		p.display();
	}

}
