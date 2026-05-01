package listConcepts;

import java.util.LinkedList;

public class LinkedlistExamples2 
{
	
	 public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> fruits = new LinkedList<>();

	        // Add elements to the LinkedList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Mango");
	        fruits.add("Orange");

	        // Display all fruits
	        System.out.println("List of Fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // Add an item at the beginning
	        fruits.addFirst("Pineapple");

	        // Add an item at the end
	        fruits.addLast("Grapes");

	        // Remove a fruit
	        fruits.remove("Mango");

	        // Display the updated list
	        System.out.println("\nUpdated List of Fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // Get and print the first and last element
	        System.out.println("\nFirst fruit: " + fruits.getFirst());
	        System.out.println("Last fruit: " + fruits.getLast());
	    }
	}
