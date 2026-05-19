package thisAndsuperKeywordExamples3;

public class Dog extends Animal {

    // Constructor
    Dog(String name) {

        // Calling parent constructor
        super(name);
    }

    // Overriding method
    @Override
    public void catsound() {

        // Calling parent method
        super.catsound();

        // Using this keyword
        this.dogsound();
    }

    // Child class method
    public void dogsound() {
        System.out.println("The dog says: bow wow");
    }


}
