package setConcepts;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples2 
{
	public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> subjects = new LinkedHashSet<>();

        // Add subjects to the set
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("History");
        subjects.add("Science"); // Duplicate, will be ignored

        // Display the subjects (in insertion order)
        System.out.println("Subjects in the LinkedHashSet:");
        for (String subject : subjects) {
            System.out.println(subject);
        }

        // Remove a subject
        subjects.remove("History");

        // Check if a subject is present
        if (subjects.contains("Math")) {
            System.out.println("\nMath is available in the set.");
        }

        // Display updated set
        System.out.println("\nAfter removing 'History':");
        for (String subject : subjects) {
            System.out.println(subject);
        }

        // Size of the set
        System.out.println("\nTotal unique subjects: " + subjects.size());
    }
}


