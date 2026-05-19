package superKeywordExamples;

public class Child extends Parent {
    int value = 200;

    void show() 
    {
        System.out.println("Child value: " + this.value);
        System.out.println("Parent value: " + super.value);
    }


}
