package conditionalStatementsConcepts;

public class NestedIfExample 

{
	
	    public static void main(String[] args) {
	        int number = 75;
	        int number1 = 7;
	        int number2 = 3;

	        if (number % 2 == 0) {
	            System.out.println("Number is Even");

	            if (number1 % 2 == 0) {
	                System.out.println("Number1 is Even");
	            } else {
	                System.out.println("Number1 is Odd");
	            }

	        } else {
	            if (number2 % 2 == 0) {
	                System.out.println("Number2 is Even");
	            } else {
	                System.out.println("Number2 is Odd");
	            }
	            System.out.println("Number is Odd");
	        }
	    }
	}


