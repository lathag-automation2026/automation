package stringMethodConcepts;

public class ConcatThreeString {
	
	public static void main(String[] args) {
        String str1 = "Learning";
        String str2 = "Java";
        String str3 = "Programming";
        
        // Concatenate all three strings
        String result = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        
        System.out.println("Concatenated string: " + result);
    }
}


