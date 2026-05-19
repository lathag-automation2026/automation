package thisAndsuperKeywordExamples1;

public class Child extends Parent {

    // Constructor of child class
    Child(int x) {
        super(x); // calling parent constructor
    }

    void display() 
    {
        System.out.println("Child value = " + x);
    }
}

