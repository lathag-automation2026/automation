package stringMethodConcepts;

public class MatchesSpecialCharExample {

	public static void main(String[] args) {
        String str = "@#$%";

        if (str.matches("[^a-zA-Z0-9]+")) {
            System.out.println("Contains only special characters");
        } else {
            System.out.println("Not only special characters");
        }
    }
}
