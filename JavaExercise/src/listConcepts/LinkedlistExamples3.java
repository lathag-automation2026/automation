package listConcepts;

import java.util.LinkedList;

public class LinkedlistExamples3
{
	
	public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Insert element at index 2
        numbers.add(2, 25); // List becomes: 10, 20, 25, 30, 40

        // Display all numbers
        System.out.println("Numbers in the list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Check if the list contains a specific number
        int searchValue = 30;
        if (numbers.contains(searchValue)) {
            System.out.println("\nThe list contains " + searchValue);
        } else {
            System.out.println("\n" + searchValue + " is not in the list.");
        }

        // Remove by index
        numbers.remove(1); // Removes 20

        // Display updated list
        System.out.println("\nList after removing element at index 1:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

