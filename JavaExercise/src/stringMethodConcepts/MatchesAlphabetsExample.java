package stringMethodConcepts;

public class MatchesAlphabetsExample {
	
	public static void main(String[] args) {
        String str = "JavaProgram";

        if (str.matches("[a-zA-Z]+")) {
            System.out.println("Contains only alphabets");
        } else {
            System.out.println("Not only alphabets");
        }
    }


}
