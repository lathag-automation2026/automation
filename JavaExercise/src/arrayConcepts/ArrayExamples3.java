package arrayConcepts;

public class ArrayExamples3 
{
	public static void main(String[] args) {

        // Array declaration
        int s[] = {4,35,6,7,12,54,21,6,78,8,54,21,1,34,1,1,3434,2,32,1,2,6545};

        // Variable to store total
        int sum = 0;

        System.out.println("Array Elements and Running Sum");
        System.out.println("--------------------------------");

        // Normal for loop
        for (int m = 0; m < s.length; m++) {

            // Add current element to sum
            sum += s[m];

            // Print array element
            System.out.println("Element : " + s[m]);

            // Print running total
            System.out.println("Current Sum : " + sum);

            System.out.println("----------------");
        }

        // Final total
        System.out.println("Final Sum = " + sum);

        System.out.println("\nUsing Enhanced For Loop");
        System.out.println("--------------------------------");

        // Enhanced for loop
        int total = 0;

        for (int san : s) {

            System.out.println("Value : " + san);

            total += san;

            System.out.println("Running Total : " + total);

            System.out.println("----------------");
        }

        // Final total using enhanced for loop
        System.out.println("Final Total = " + total);
    }
}
