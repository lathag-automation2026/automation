package classesMethodsConcepts;

public class AverageOfThreeNumbersExample2 
{

	    // Method to calculate average of 3 numbers
	    public static double findAverage(int a, int b, int c) {
	        return (a + b + c) / 3.0;  // use 3.0 to ensure decimal division
	    }

	    public static void main(String[] args) {
	        int num1 = 20;
	        int num2 = 20;
	        int num3 = 30;

	        double avg = findAverage(num1, num2, num3);

	        System.out.println("Average of " + num1 + ", " + num2 + ", " + num3 + " = " + avg);
	    }
	}



