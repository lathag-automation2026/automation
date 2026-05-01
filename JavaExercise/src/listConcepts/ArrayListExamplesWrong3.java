package listConcepts;

import java.util.ArrayList;

public class ArrayListExamplesWrong3 
{

	  public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        // Add elements to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        // Display all names
	        System.out.println("List of Numbers:");
	        for (Integer number : numbers) 
	        {    
		         System.out.println(number);

	        }  
	        // Remove one name
	        numbers.remove(30);
	        // Display the updated list
	        System.out.println("After removing '30':");
	        for (Integer number : numbers) {
	            System.out.println(number);
	        }
	      //   Get the size of the list
	       System.out.println("Total numbers: " + numbers.size());
	    }
}
