package stringMethodConcepts;

public class TrimExample {
	
	public static void main(String[] args) {
        String strWithSpaces = "   Hello,     World!   ";
        String trimmed = strWithSpaces.trim();
        System.out.println("Trimmed: " + trimmed);
        // Output: Trimmed: Hello, World!
    }
}

