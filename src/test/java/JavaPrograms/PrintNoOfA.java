package JavaPrograms;

public class PrintNoOfA 
{
	public static void main(String[] args) 
	{
		String str = "Mahesh Bhanudas JejurkAr";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='a') 
			{
				count ++;
			}
		}
		System.out.println("A occurance: "+count);
	}
}
