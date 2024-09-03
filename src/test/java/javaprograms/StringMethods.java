package javaprograms;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s = "Welcome";		
		System.out.println(s);
		
		int l = s.length();
		System.out.println(l);
		
		
		String s2 ="Welcome to selenium java python programming";
		System.out.println(s2.length());
		String s3 = s2.replace("python", "c#");
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s2.substring(0, 3));
		
		
		String s5 = "Mahesh";
		String[] s6 = s5.split("e");
		System.out.println(s6[0]);
		System.out.println(s6[1]);
		
		
		String s8="mahesh.jejurkar@gmail.com";
		String s9[] = s8.split("\\.")[1].split("@");
		System.out.println(Arrays.toString(s9));
		
		String s10="Dhruv Mahesh Jejurkar";
		System.out.println(Arrays.toString(s10.split(" ")));
		
		String s11 = "Dhruv*Mahesh*Jejurkar";
		System.out.println(Arrays.toString(s11.split("\\*")));
		
		String s12 = "Dhruv&Mahesh&Jejurkar";
		System.out.println(Arrays.toString(s12.split("&")));
		
		String s13 = "Dhruv(Mahesh(Jejurkar";
		System.out.println(Arrays.toString(s13.split("\\(")));

		String s14 = "Dhruv)Mahesh)Jejurkar";
		System.out.println(Arrays.toString(s14.split("\\)")));
		
		String s15 = "Dhruv-Mahesh-Jejurkar";
		System.out.println(Arrays.toString(s15.split("-")));
		
		String s16 = "Dhruv_Mahesh_Jejurkar";
		System.out.println(Arrays.toString(s16.split("_")));
		
		String s17 = "Dhruv^Mahesh^Jejurkar";
		System.out.println(Arrays.toString(s17.split("\\^")));
		
		String s18 = "Dhruv$Mahesh$Jejurkar";
		System.out.println(Arrays.toString(s18.split("\\$")));
		
		
		String s19 = "Dhruv#Mahesh#Jejurkar";
		System.out.println(Arrays.toString(s19.split("#")));
		
		String s20 = "Dhruv!Mahesh!Jejurkar";
		System.out.println(Arrays.toString(s20.split("!")));
		
		String s21 = "Dhruv%Mahesh%Jejurkar";
		System.out.println(Arrays.toString(s21.split("%")));
		
		String s22 = "Dhruv+Mahesh+Jejurkar";
		System.out.println(Arrays.toString(s22.split("\\+")));
		
		String s23 = "Dhruv=Mahesh=Jejurkar";
		System.out.println(Arrays.toString(s23.split("=")));
		
		String s24 = "Dhruv:Mahesh:Jejurkar";
		System.out.println(Arrays.toString(s24.split(":")));
	}
}