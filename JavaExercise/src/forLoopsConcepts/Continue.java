package forLoopsConcepts;

public class Continue {

	  public static void main(String[] args) {

	        for (int i = 1; i <= 10; i++) {

	            if (i == 5) {
	                System.out.println("Value of i inside first if " + i);
	                continue; // Skip the rest of this iteration when i = 5
	            }

	            System.out.println("Value of i outside first if.But inside for loop " + i);

	            if (i == 10) {
	                System.out.println(i);
	            }
	        }
	    }
	}
//Explanation:

//For Loop:

//The for loop iterates from i = 1 to i <= 10.
//First if Condition:

//When i becomes 5, the condition i == 5 is true.
//The message "Value of i inside first if: 5" is printed.
//The continue statement is executed, which skips the remaining code in the current iteration and moves to the next iteration.
//Second if Condition:

//This condition is only checked when i is not 5 (because of the continue statement).
//When i reaches 10, the message "10" is printed.
