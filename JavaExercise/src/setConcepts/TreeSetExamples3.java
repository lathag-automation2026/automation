package setConcepts;

import java.util.TreeSet;

public class TreeSetExamples3 
{
	
	 public static void main(String[] args) {
	        // Create a TreeSet of Integers
	        TreeSet<Integer> rollNumbers = new TreeSet<>();

	        // Add some roll numbers
	        rollNumbers.add(105);
	        rollNumbers.add(101);
	        rollNumbers.add(103);
	        rollNumbers.add(102);
	        rollNumbers.add(101); // Duplicate, ignored

	        // Display roll numbers (sorted automatically)
	        System.out.println("Student Roll Numbers (Sorted):");
	        for (int roll : rollNumbers) {
	            System.out.println(roll);
	        }

	        // Remove a roll number
	        rollNumbers.remove(103);

	        // Check if a roll number exists
	        int searchRoll = 102;
	        if (rollNumbers.contains(searchRoll)) {
	            System.out.println("\nRoll number " + searchRoll + " is present.");
	        } else {
	            System.out.println("\nRoll number " + searchRoll + " is not present.");
	        }

	        // First and last elements
	        System.out.println("\nLowest roll number: " + rollNumbers.first());
	        System.out.println("Highest roll number: " + rollNumbers.last());

	        // Display final list
	        System.out.println("\nUpdated list of roll numbers:");
	        for (int roll : rollNumbers) {
	            System.out.println(roll);
	        }
	    }
	}