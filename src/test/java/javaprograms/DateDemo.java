package javaprograms;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		Date objDate = new Date();
		System.out.println(objDate);

		System.out.println();
		String StringDateFormat = "yyyy.MM.dd EEEE HH:mm:ss a z";
		SimpleDateFormat SmplDateFormat = new SimpleDateFormat(StringDateFormat);
		System.out.println(SmplDateFormat.format(objDate));
		
		
		System.out.println();
		String timestamp = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-a").format(new Date());
		System.out.println(timestamp);
	}

}
