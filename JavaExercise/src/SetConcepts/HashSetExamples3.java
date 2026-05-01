package SetConcepts;

import java.util.HashSet;

public class HashSetExamples3 
{
	
	 public static void main(String[] args) {
	        // Create a HashSet to store roll numbers
	        HashSet<Integer> rollNumbers = new HashSet<>();

	        // Add some roll numbers
	        rollNumbers.add(101);
	        rollNumbers.add(102);
	        rollNumbers.add(103);
	        rollNumbers.add(104);
	        rollNumbers.add(101); // Duplicate - will be ignored

	        // Display all roll numbers
	        System.out.println("Roll numbers:");
	        for (int roll : rollNumbers) {
	            System.out.println(roll);
	        }

	        // Check if a roll number exists
	        int searchRoll = 102;
	        if (rollNumbers.contains(searchRoll)) {
	            System.out.println("\nRoll number " + searchRoll + " is present.");
	        } else {
	            System.out.println("\nRoll number " + searchRoll + " is not present.");
	        }

	        // Remove a roll number
	        rollNumbers.remove(103);

	        // Display updated list
	        System.out.println("\nAfter removing roll number 103:");
	        for (int roll : rollNumbers) {
	            System.out.println(roll);
	        }

	        // Size of the set
	        System.out.println("\nTotal unique roll numbers: " + rollNumbers.size());
	    }
	}


