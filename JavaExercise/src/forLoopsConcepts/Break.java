package forLoopsConcepts;

public class Break 
{
	   public static void main(String[] args) {

	        for (int i = 1; i <= 10; i++) {

	            if (i == 5) {
	                System.out.println("Value of i inside first if " + i);
	                break; // Exit the loop when i becomes 5
	            }

	            System.out.println("Value of i outside first if.But inside for loop " + i);

	            if (i == 10) {
	                System.out.println(i);
	            }
	        }
	    }
	}
	// Explanation:

	// The break statement is used to terminate the loop immediately.
	// When i becomes 5, the break statement is executed, and the loop exits.


