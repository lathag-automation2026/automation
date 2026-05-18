package multipleInheritanceConcepts2;

public class Son implements Father, Mother {

    public void money() {
        System.out.println("Father gives money");
    }

    public void gold() {
        System.out.println("Mother gives gold");
    }
}

