package conditionalStatementsConcepts;

public class MaximumOfThreeNumbers 
{
	
	public static void main(String[] args) {

	        int a = 56, b = 90, c = 75;

	        if (a > b && a > c) {
	            System.out.println("A is greatest");
	        } else if (b > a && b > c) {
	            System.out.println("B is greatest");
	        } else {
	            System.out.println("C is greatest");
	        }
	    }

}
