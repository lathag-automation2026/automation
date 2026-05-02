package stringMethodConcepts;

public class MatchesMixedExample {
	public static void main(String[] args) {
        String str = "abc123@";

        if (str.matches(".*[0-9].*")) {
            System.out.println("Contains a digit");
        }

        if (str.matches(".*[a-zA-Z].*")) {
            System.out.println("Contains an alphabet");
        }

        if (str.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Contains a special character");
        }
    }
}

