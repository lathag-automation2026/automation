package arrayConcepts;

public class ArrayExamples1 
{

	    public static void main(String[] args) {

	        // Array Initialization
	        int[] numbers = {50, 15, 25, 30, 40};

	        System.out.println("--- Array Initialization and Length ---");

	        // Array length
	        System.out.println("Initial array length: " + numbers.length);

	        // Original element
	        System.out.println("Original element at index 0: " + numbers[0]);

	        // Modify element
	        numbers[0] = 75;

	        // Modified element
	        System.out.println("Modified element at index 0: " + numbers[0]);



	        // Standard for loop
	        System.out.println("\n--- Iterating with Standard 'for' Loop ---");
	        System.out.println("Index : Value");
            for (int i = 0; i < numbers.length; i++) 
            {
                System.out.println("************Index : Value************" + numbers[i]);
	        }

	        // Printing index and values separately
	        for (int i = 0; i < numbers.length; i++) 
	        {
	            System.out.println(i + "    : " + numbers[i]);
	        }


	        // Array Sum Calculation
	        System.out.println("\n--- Array Sum Calculation ---");
	        int sum = 0;
	        for (int i = 0; i < numbers.length; i++) 
	        {
	            sum = sum + numbers[i];
	        }
             System.out.println("The total sum of all elements is: " + sum);



	        // for-each loop
	        for (int value : numbers) 
	        {
	            System.out.println("********print all values inside for each********"+ value);
	        }



	        // Enhanced for-each loop
	        System.out.println("\n--- Iterating with Enhanced 'for-each' Loop ---");
	        System.out.println("Array elements: ");
	        for (int value : numbers) 
	        {
	            System.out.print(value + " ");
	        }
	    }
	}