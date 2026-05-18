package hybridInheritanceConcepts1;

public class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

