package methodOverridingConcepts2;

public class MethodOverriding {

	 public static void main(String[] args) {
	        Animal animal = new Dog(); // Polymorphism: Animal reference, Dog object
	        animal.makeSound(); // Output: Dog barks.
	    }
	}

	// Explanation:

	// Parent Class (Animal):

	// Defines a method makeSound() with a generic implementation.
	// Child Class (Dog):

	// Inherits from the Animal class.
	// Overrides the makeSound() method to provide a specific implementation for dogs.
	// The @Override annotation is optional but recommended as it helps the compiler catch potential errors.
	// Main Method:

	// Creates an Animal reference variable animal.
	// Assigns a Dog object to this reference (polymorphism).
	// When animal.makeSound() is called, the makeSound() method of the Dog class is executed, demonstrating method overriding.

