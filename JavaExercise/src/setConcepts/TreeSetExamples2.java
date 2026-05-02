package setConcepts;

import java.util.TreeSet;

public class TreeSetExamples2 
{
	
	 public static void main(String[] args) {
	        // Create a TreeSet of Strings
	        TreeSet<String> names = new TreeSet<>();

	        // Add names
	        names.add("Zara");
	        names.add("Aman");
	        names.add("John");
	        names.add("Bob");
	        names.add("Aman"); // Duplicate, ignored

	        // Display names (sorted automatically)
	        System.out.println("Names in TreeSet (sorted):");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        // Remove an element
	        names.remove("John");

	        // Check if a name exists
	        if (names.contains("Bob")) {
	            System.out.println("\nBob is in the set.");
	        }

	        // Display final names
	        System.out.println("\nUpdated list:");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        // Display size
	        System.out.println("\nTotal unique names: " + names.size());
	    }
	}

