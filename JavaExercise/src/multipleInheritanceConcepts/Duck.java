package multipleInheritanceConcepts;

public class Duck  implements Flyable, Swimmable {

    public void fly() {
        System.out.println("Flying...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}