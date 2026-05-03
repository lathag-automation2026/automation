package constructorConcepts2;

public class Dog 
{
    String breed;

    // No-arg constructor
    Dog() {
        breed = "Unknown";
        System.out.println("A new dog is born!");
    }

    void display() {
        System.out.println("Breed: " + breed);
    }
}