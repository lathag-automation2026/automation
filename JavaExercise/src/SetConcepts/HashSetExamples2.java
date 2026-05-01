package SetConcepts;

import java.util.HashSet;

public class HashSetExamples2 
{
	
	 public static void main(String[] args) {
	        // Create a HashSet of Strings
	        HashSet<String> cities = new HashSet<>();

	        // Add elements to the HashSet
	        cities.add("Delhi");
	        cities.add("Mumbai");
	        cities.add("Chennai");
	        cities.add("Kolkata");
	        cities.add("Delhi"); // duplicate, will not be added

	        // Display all cities
	        System.out.println("Cities in the HashSet:");
	        for (String city : cities) {
	            System.out.println(city);
	        }

	        // Check if a city is present
	        if (cities.contains("Mumbai")) {
	            System.out.println("\nMumbai is in the set.");
	        }

	        // Remove a city
	        cities.remove("Chennai");

	        // Display updated set
	        System.out.println("\nAfter removing Chennai:");
	        for (String city : cities) {
	            System.out.println(city);
	        }

	        // Size of the set
	        System.out.println("\nTotal unique cities: " + cities.size());
	    }
	}
	
	
