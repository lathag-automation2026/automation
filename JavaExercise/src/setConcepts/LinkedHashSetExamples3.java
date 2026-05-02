package setConcepts;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples3 
{
	 public static void main(String[] args) {
	        // Create a LinkedHashSet to store roll numbers
	        LinkedHashSet<Integer> rollNumbers = new LinkedHashSet<>();

	        // Add roll numbers
	        rollNumbers.add(101);
	        rollNumbers.add(105);
	        rollNumbers.add(103);
	        rollNumbers.add(102);
	        rollNumbers.add(105); // Duplicate, will be ignored

	        // Display all roll numbers (in insertion order)
	        System.out.println("Roll numbers in the LinkedHashSet:");
	        for (int roll : rollNumbers) {
	            System.out.println(roll);
	        }

	        // Remove a roll number
	        rollNumbers.remove(103);

	        // Check for existence
	        if (rollNumbers.contains(102)) {
	            System.out.println("\nRoll number 102 is present.");
	        } else {
	            System.out.println("\nRoll number 102 is not present.");
	        }

	        // Display the final list
	        System.out.println("\nFinal list of roll numbers:");
	        for (int roll : rollNumbers) {
	            System.out.println(roll);
	        }

	        // Display size
	        System.out.println("\nTotal roll numbers: " + rollNumbers.size());
	    }
	}

