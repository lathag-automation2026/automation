package stringMethodConcepts;

public class TokenExample {
	
	 public static void main(String[] args) {
	        String str = "Java is easy";
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            if (ch == ' ') {
	                System.out.println("Space found (word separator)");
	            } else {
	                System.out.println(ch);
	            }
	        }
	    }
	}


