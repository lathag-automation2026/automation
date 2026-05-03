package constructorConcepts3;

public class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}