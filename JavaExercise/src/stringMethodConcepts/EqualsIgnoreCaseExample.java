package stringMethodConcepts;

public class EqualsIgnoreCaseExample {


	  public static void main(String[] args) {
	        String str1 = "hello";
	        String str2 = "Hello";
	        
	        // Compare strings ignoring case

	        boolean isEqualCase = str1.equals(str2);
            boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
	        
	        System.out.println("Equal case: " + isEqualCase);
	        System.out.println("Equal ignoring case: " + isEqualIgnoreCase);
	    }
	}
