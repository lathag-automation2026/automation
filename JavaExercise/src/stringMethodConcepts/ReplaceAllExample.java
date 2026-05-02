package stringMethodConcepts;

public class ReplaceAllExample {

	
	public static void main(String[] args) {
        String str = "Hello, World!";
        String replaced = str.replaceAll("[aeiou]", "*");
        System.out.println("Replace vowels with '*': " + replaced);
        // Output: H*ll*, W*rld!
    }
}

