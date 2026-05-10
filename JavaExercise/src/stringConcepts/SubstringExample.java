package stringConcepts;

public class SubstringExample 
{
	public static void main(String[] args) {
        String s = "Akash is a student learning Selenium with Java";

        String part1 = s.substring(2);          // from index 2 to end
        String part2 = s.substring(5, 35);      // from index 5 to 35

        System.out.println("Substring from 2: " + part1);
        System.out.println("Substring 5 to 35: " + part2);
    }
}

