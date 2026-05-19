package thisAndsuperKeywordExamples2;

public class Child extends Parent {

    int y;

    // Child constructor
    Child(int x, int y) {
        super(x);   // parent value
        this.y = y; // child value
    }

    void display() {
        System.out.println("Parent value x = " + x);
        System.out.println("Child value y = " + y);
    }
}

