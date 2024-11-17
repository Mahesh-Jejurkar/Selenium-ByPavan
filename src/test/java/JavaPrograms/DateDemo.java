package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {	
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss.a").format(new Date());
		System.out.println(timeStamp);
	}
}
