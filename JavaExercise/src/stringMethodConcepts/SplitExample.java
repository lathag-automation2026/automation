package stringMethodConcepts;

import java.util.Arrays;

public class SplitExample {
	
	 public static void main(String[] args) {
	        String str = "Hello, World!";
	        String[] parts = str.split(", ");  // delimiter is ", "
	        System.out.println("Split: " + Arrays.toString(parts));
	        // Output: Split: [Hello, World!]
	    }
	}


