package methodOverloadingConcepts;

public class MethodOverloadingExample2 {

	   public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public static void main(String[] args) {
	    	MethodOverloadingExample2 obj = new MethodOverloadingExample2();

	       int sum1 = obj.add(10, 20);
	        double sum2 = obj.add(10.5, 20.5);
	        int sum3 = obj.add(10, 20, 30);
	    	

	       System.out.println("Sum of integers: " + sum1);
	        System.out.println("Sum of doubles: " + sum2);
	       System.out.println("Sum of three integers: " + sum3);
	    	
	    }
	}


	// Explanation:

	// In this example, we have defined three methods named add:

	// add(int a, int b): Takes two integer arguments and returns their sum as an integer.
	// add(double a, double b): Takes two double arguments and returns their sum as a double.
	// add(int a, int b, int c): Takes three integer arguments and returns their sum as an integer.
	// When we call the add method in the main method, the compiler determines which method to invoke based on the number and 
//types of arguments passed. This allows us to perform arithmetic operations on different data types using the same method name.

	// Key Points:

	// Method overloading is based on compile-time polymorphism.
	// The return type of overloaded methods can be the same or different.
	// Overloading methods with only different return types is not allowed.
	// The compiler chooses the most appropriate method based on the argument list.
