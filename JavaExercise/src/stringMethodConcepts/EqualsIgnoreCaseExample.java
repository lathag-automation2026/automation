package stringMethodConcepts;

public class EqualsIgnoreCaseExample {


	  public static void main(String[] args) {
	        String str1 = "hello";
	        String str2 = "HELLO";
	        
	        // Compare strings ignoring case
	        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
	        
	        System.out.println("Equal ignoring case: " + isEqualIgnoreCase);
	    }
	}
