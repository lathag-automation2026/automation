package methodOverridingConcepts2;

public class Dog extends Animal {
    @Override
    public void makeSound() 
    {
    	super.makeSound();
        System.out.println("Dog barks - The Function makeSound logic is overrided.");
    }


}
