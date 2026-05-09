package conditionalStatementsConcepts;

public class NestedIfExample3 

{
	
	 public static void main(String[] args) {

	        int overallMark = 50;
	        int mathsMark = 65;

	        // Condition:
	        // Overall mark should be 60%
	        // Maths mark should be 80%

	        if (overallMark >= 60) {

	            System.out.println("Overall mark condition passed");

	            // Nested if inside IF block
	            if (mathsMark >= 80) {
	                System.out.println("Student is Eligible");
	            } else {
	                System.out.println("Student is NOT Eligible because maths mark is below 80");
	            }

	        } else {

	            System.out.println("Overall mark is below 60");

	            // Nested if inside ELSE block
	            if (mathsMark >= 80) {
	                System.out.println("Good in Maths but overall mark is low");
	            } else {
	                System.out.println("Both overall mark and maths mark are low");
	            }
	        }
	    }
	}