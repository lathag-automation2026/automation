package switchCaseConcepts;

public class Days 
{
	  public static void main(String[] args) {
	        int day = 4;

	        switch (day) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid day");
	        }
	    }
	}
//	     Explanation: 

	// Switch Statement: A switch statement is used to execute different code blocks based on the value of an expression.
	// Case Labels: Each case label specifies a value to be compared with the expression in the switch statement.
	// Break Statement: The break statement is used to exit the switch statement after executing the code block for the matching case.
	// Default Case: The default case is optional and is executed if none of the case labels match the expression.
	// In this example, the day variable is checked against each case label. When a match is found, the corresponding code block is executed, \
     //and the switch statement is exited. If no match is found, the default case is executed


