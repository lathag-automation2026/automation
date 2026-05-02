package stringMethodConcepts;

public class SplitSentenceExample {

	 public static void main(String[] args) {
	        String sentence = "Java makes coding easier";
	        
	        // Split the sentence into words using space as delimiter
	        String[] words = sentence.split(" ");
	        
	        // Print each word with its index
	        for (int i = 0; i < words.length; i++) {
	            System.out.println("Index " + i + ": " + words[i]);
	        }
	    }
	}

