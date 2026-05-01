package listConcepts;

import java.util.ArrayList;

public class ArrayListExamples2 
{
	 public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<>();
	        // Add elements to the ArrayList
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add("Diana");
	        // Display all names
	        System.out.println("List of Names:");
	        for (String name : names) {
	            System.out.println(name);
	        }
	        // Remove one name
	        names.remove("Bob");
	        // Display the updated list
	        System.out.println("After removing 'Bob':");
	        for (String name : names) {
	            System.out.println(name);
	        }
	        // Get the size of the list
	        System.out.println("Total names: " + names.size());
	    }
	}

