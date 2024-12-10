package JavaPrograms;

public class ThisKeyword 
{
	int x, y;
	
	void setData(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	
	void display() 
	{
		System.out.println(x+"\t"+y);
	}
	
	public static void main(String[] args) 
	{
		ThisKeyword obj1 = new ThisKeyword();
		obj1.setData(10, 20);
		obj1.display();
	}
}
