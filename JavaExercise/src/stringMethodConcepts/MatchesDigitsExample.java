package stringMethodConcepts;

public class MatchesDigitsExample {
    public static void main(String[] args) {
        String str = "12345";

        if (str.matches("[0-9]+")) {
            System.out.println("Contains only digits");
        } else {
            System.out.println("Not only digits");
        }
    }
}