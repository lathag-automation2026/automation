package stringMethodConcepts;

import java.util.Arrays;

public class SplitSentenceNoLoop {
	
	 public static void main(String[] args) {
	        String sentence = "Java makes coding easier";
	        
	        // Split the sentence into words using space as delimiter
	        String[] words = sentence.split(" ");
	        
	        // Print the array directly without using a loop
	        System.out.println(Arrays.toString(words));
	    }
	}


