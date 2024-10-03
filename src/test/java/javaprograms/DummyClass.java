package javaprograms;

import java.util.Random;

public class DummyClass {

	public static void main(String[] args) {
        System.out.println("Random Integer: " + new Random().nextInt(Integer.MAX_VALUE));
        
        System.out.println("Random Integer (0-99): " + new Random().nextInt(100));
        
        System.out.println(Math.round(Math.random()));
        
       
	}

}
