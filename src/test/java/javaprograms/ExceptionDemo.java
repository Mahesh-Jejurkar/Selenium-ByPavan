package javaprograms;

import java.io.FileWriter;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("D://Data1.txt", true);
		file.append(" Jejurkar");
		file.close();
	}
}