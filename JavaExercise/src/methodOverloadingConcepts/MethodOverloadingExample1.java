package methodOverloadingConcepts;

public class MethodOverloadingExample1 {

	public void printMessage() {
        System.out.println("This is a message without any parameters.");
    }

    public void printMessage(String message) {
        System.out.println("This is a message with a string parameter: " + message);
    }

    public void printMessage(int num1, int num2) {
        System.out.println("This is a message with two integer parameters: " + num1 + " and " + num2);
    }
    
    public static void main(String[] args) {
        // Create an object of the class
    	MethodOverloadingExample1 obj = new MethodOverloadingExample1();

        // Call the overloaded methods with different arguments
        obj.printMessage();
        obj.printMessage("Hello, world!");
        obj.printMessage(10, 20);
    }
}

//Explanation:
// Method Overloading: This concept allows you to have multiple methods with the same name but different parameters. 
//The compiler determines which method to call based on the number and types of arguments passed1 during the method call.

// Overloaded printMessage Methods:
// The first printMessage method takes no arguments.
// The second printMessage method takes a String argument.
// The third printMessage method takes two int arguments.
// Method Call: In the main method, we call each of the overloaded methods with appropriate arguments. 
//The compiler selects the correct method based on the number and types of arguments provided.


